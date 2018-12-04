package com.health.mall.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "health_mall_product_type")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
@Data
public class ShopCartItems implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "account")
    private String account;


    @Column(name = "shopcart_id")
    private String shopcartId;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "sku_code")
    private String skuCode;

    @Column(name = "product_num")
    private Double productNum;

    @Column(name = "is_status")
    private Boolean isStatus;

    @Column(name = "is_delete")
    private Boolean isDelete;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
