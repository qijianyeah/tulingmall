package com.tuling.tulingmall.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.tuling.tulingmall.model.UmsMemberMemberTagRelation;
import com.tuling.tulingmall.model.UmsMemberMemberTagRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@DS("user")
public interface UmsMemberMemberTagRelationMapper {
    long countByExample(UmsMemberMemberTagRelationExample example);

    int deleteByExample(UmsMemberMemberTagRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberMemberTagRelation record);

    int insertSelective(UmsMemberMemberTagRelation record);

    List<UmsMemberMemberTagRelation> selectByExample(UmsMemberMemberTagRelationExample example);

    UmsMemberMemberTagRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberMemberTagRelation record, @Param("example") UmsMemberMemberTagRelationExample example);

    int updateByExample(@Param("record") UmsMemberMemberTagRelation record, @Param("example") UmsMemberMemberTagRelationExample example);

    int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record);

    int updateByPrimaryKey(UmsMemberMemberTagRelation record);
}