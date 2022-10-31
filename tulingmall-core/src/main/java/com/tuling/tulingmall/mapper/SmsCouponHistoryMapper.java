package com.tuling.tulingmall.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.tuling.tulingmall.model.SmsCouponHistory;
import com.tuling.tulingmall.model.SmsCouponHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@DS("promotion")
public interface SmsCouponHistoryMapper {
    long countByExample(SmsCouponHistoryExample example);

    int deleteByExample(SmsCouponHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponHistory record);

    int insertSelective(SmsCouponHistory record);

    List<SmsCouponHistory> selectByExample(SmsCouponHistoryExample example);

    SmsCouponHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsCouponHistory record, @Param("example") SmsCouponHistoryExample example);

    int updateByExample(@Param("record") SmsCouponHistory record, @Param("example") SmsCouponHistoryExample example);

    int updateByPrimaryKeySelective(SmsCouponHistory record);

    int updateByPrimaryKey(SmsCouponHistory record);
}