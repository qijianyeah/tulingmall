package com.tuling.tulingmall.history.domain;


import com.tuling.tulingmall.history.model.OmsOrder;
import com.tuling.tulingmall.history.model.OmsOrderItem;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * 包含订单商品信息的订单详情
 */
@Document("orderhistory")
public class OmsOrderDetail extends OmsOrder {
    private List<OmsOrderItem> orderItemList;

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
