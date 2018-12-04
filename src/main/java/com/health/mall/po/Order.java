package com.health.mall.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "health_mall_order")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@Data
public class Order implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "account")
    private String account;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "member_code")
    private String memberCode;

    @Column(name = "order_amount")
    private Double orderAmount;

    @Column(name = "pay_amount")
    private Double payAmount;

    @Column(name = "order_status")
    private Integer orderStatus;

    @Column(name = "pay_status")
    private Integer payStatus;

    @Column(name = "pay_time")
    private Date payTime;

    @Column(name = "address_id")
    private String addressId;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

}
