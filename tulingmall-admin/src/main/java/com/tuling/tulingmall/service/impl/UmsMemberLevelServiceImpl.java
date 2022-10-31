package com.tuling.tulingmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tuling.tulingmall.mapper.UmsMemberLevelMapper;
import com.tuling.tulingmall.model.UmsMemberLevel;
import com.tuling.tulingmall.service.UmsMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员等级管理Service实现类
 * Created on 2018/4/26.
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService{
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        QueryWrapper<UmsMemberLevel> wrapper = new QueryWrapper<>();
        wrapper.eq("default_status",defaultStatus);
        return memberLevelMapper.selectList(wrapper);
    }
}
