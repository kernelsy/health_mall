package com.health.mall.service.dto;

import com.health.mall.po.Order;
import lombok.Data;

import java.util.Date;

@Data
public class OrderDTO extends Order {

    private Date startCreateTime;

    private Date endCreateTime;

    private Date startPayTime;

    private Date endPayTime;

}
