package com.health.mall.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "health_mall_order_item")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
@Data
public class OrderItem implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "account")
    private String account;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "sku_code")
    private String skuCode;

    @Column(name = "sku_num")
    private Double skuNum;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
