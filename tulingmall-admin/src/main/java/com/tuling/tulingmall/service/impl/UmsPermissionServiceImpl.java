package com.tuling.tulingmall.service.impl;

import com.tuling.tulingmall.dto.UmsPermissionNode;
import com.tuling.tulingmall.mapper.UmsPermissionMapper;
import com.tuling.tulingmall.model.UmsPermission;
import com.tuling.tulingmall.service.UmsPermissionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 后台用户权限管理Service实现类
 * Created on 2018/9/29.
 */
@Service
public class UmsPermissionServiceImpl implements UmsPermissionService {
    @Autowired
    private UmsPermissionMapper permissionMapper;

    @Override
    public int create(UmsPermission permission) {
        permission.setStatus(1);
        permission.setCreateTime(new Date());
        permission.setSort(0);
        return permissionMapper.insert(permission);
    }

    @Override
    public int update(Long id, UmsPermission permission) {
        permission.setId(id);
        return permissionMapper.updateById(permission);
    }

    @Override
    public int delete(List<Long> ids) {
        return permissionMapper.deleteBatchIds(ids);
    }

    @Override
    public List<UmsPermissionNode> treeList() {
        List<UmsPermission> permissionList = permissionMapper.selectList(null);
        return permissionList.stream()
                .filter(permission -> permission.getPid().equals(0L))
                .map(permission -> covert(permission,permissionList)).collect(Collectors.toList());
    }

    @Override
    public List<UmsPermission> list() {
        return permissionMapper.selectList(null);
    }

    /**
     * 将权限转换为带有子级的权限对象
     * 当找不到子级权限的时候map操作不会再递归调用covert
     */
    private UmsPermissionNode covert(UmsPermission permission,List<UmsPermission> permissionList){
        UmsPermissionNode node = new UmsPermissionNode();
        BeanUtils.copyProperties(permission,node);
        List<UmsPermissionNode> children = permissionList.stream()
                .filter(subPermission -> subPermission.getPid().equals(permission.getId()))
                .map(subPermission -> covert(subPermission,permissionList)).collect(Collectors.toList());
        node.setChildren(children);
        return node;
    }
}
