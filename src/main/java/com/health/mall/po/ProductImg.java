package com.health.mall.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "health_mall_product_img")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
@Data
public class ProductImg implements Serializable  {


    @Id
    @GenericGenerator(name = "jpa-uuid",strategy = "uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "account")
    private String account;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "sku_code")
    private String skuCode;

    @Column(name = "img1")
    private String img1;

    @Column(name = "img2")
    private String img2;

    @Column(name = "img3")
    private String img3;

    @Column(name = "img4")
    private String img4;

    @Column(name = "img5")
    private String img5;

    @Column(name = "img6")
    private String img6;

    @Column(name = "img7")
    private String img7;

    @Column(name = "img8")
    private String img8;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
