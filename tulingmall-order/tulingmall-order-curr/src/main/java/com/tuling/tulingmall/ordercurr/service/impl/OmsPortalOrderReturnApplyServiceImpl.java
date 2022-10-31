package com.tuling.tulingmall.ordercurr.service.impl;

import com.tuling.tulingmall.ordercurr.domain.OmsOrderReturnApplyParam;
import com.tuling.tulingmall.ordercurr.mapper.OmsOrderReturnApplyMapper;
import com.tuling.tulingmall.ordercurr.model.OmsOrderReturnApply;
import com.tuling.tulingmall.ordercurr.service.OmsPortalOrderReturnApplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 订单退货管理Service实现类
 * Created by macro on 2018/10/17.
 */
@Service
public class OmsPortalOrderReturnApplyServiceImpl implements OmsPortalOrderReturnApplyService {
    @Autowired
    private OmsOrderReturnApplyMapper returnApplyMapper;
    @Override
    public int create(OmsOrderReturnApplyParam returnApply) {
        OmsOrderReturnApply realApply = new OmsOrderReturnApply();
        BeanUtils.copyProperties(returnApply,realApply);
        realApply.setCreateTime(new Date());
        realApply.setStatus(0);
        return returnApplyMapper.insert(realApply);
    }
}
