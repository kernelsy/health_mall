package com.health.mall.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;



@Entity
@Table(name = "health_mall_addressment")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@Data
public class AddressMent implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "account")
    private String account;

    @Column(name = "member_code")
    private String memberCode;

    @Column(name = "reciver_name")
    private String reciverName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "postal_code")
    private Integer postalCode;

    @Column(name = "province")
    private String  province;

    @Column(name = "city")
    private String  city;

    @Column(name = "district")
    private String  district;

    @Column(name = "street")
    private String  street;

    @Column(name = "acquiescent")
    private Boolean  acquiescent;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

}
