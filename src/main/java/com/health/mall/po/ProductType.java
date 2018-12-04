package com.health.mall.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "health_mall_product_type")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
@Data
public class ProductType implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "account")
    private String account;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "parent_type")
    private String parentType;

    @Column(name = "type_sort")
    private Integer typeSort;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;


}
