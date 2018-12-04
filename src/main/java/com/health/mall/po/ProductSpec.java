package com.health.mall.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "health_mall_product_spec")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
@Data
public class ProductSpec implements Serializable {


    @Id
    @GeneratedValue( generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "account")
    private String account;

    @Column(name = "spec_name")
    private String specName;

    @Column(name = "spec_sort")
    private Integer specSort;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
