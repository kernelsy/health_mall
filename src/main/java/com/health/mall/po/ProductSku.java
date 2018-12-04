package com.health.mall.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "health_mall_product_sku")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
@Data
public class ProductSku implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "account")
    private String account;

    @Column(name = "sku_code")
    private String skuCode;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "sku_spec")
    private String skuSpec;

    @Column(name = "count")
    private Double count;//总库存

    @Column(name = "platform_price")
    private Double platformPrice;

    @Column(name = "market_price")
    private Double marketPrice;

    @Column(name = "member_price")
    private Double memberPrice;

    @Column(name = "stock")
    private Double stock;//实际库存

    @Column(name = "total_count")
    private Double totalCount;//销量

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
