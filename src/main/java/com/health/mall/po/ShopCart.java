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
public class ShopCart implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "account")
    private String account;


    @Column(name = "member_code")
    private String memberCode;

    @Column(name = "total_count")
    private Double totalCount;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
