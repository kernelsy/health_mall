package com.health.mall.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "health_mall_product")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
@Data
public class Product implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "account")
    private String account;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_title")
    private String productTitle;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "product_spec")
    private String productSpec;

    @Column(name = "platform_price")
    private Double platformPrice;

    @Column(name = "market_price")
    private Double marketPrice;

    @Column(name = "member_price")
    private Double memberPrice;

    @Column(name = "product_vender")
    private String productVender;

    @Column(name = "vender_type")
    private Boolean VenderType;

    @Column(name = "product_people")
    private Integer productPeople;

    @Column(name = "product_explain")
    private String productExplain;

    @Column(name = "product_img")
    private String productImg;

    @Column(name = "product_sort")
    private Integer productSort;

    @Column(name = "product_status")
    private Integer productStatus;

    @Column(name = "product_shevles")
    private Boolean productShevles;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;



}
