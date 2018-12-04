package com.health.mall.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "health_mall_banner")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
@Data
public class Banner implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "account")
    private String account;

    @Column(name = "banner_title")
    private String bannerTitle;

    @Column(name = "banner_img")
    private String bannerImg;

    @Column(name = "banner_url")
    private String bannerUrl;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "banner_sort")
    private Integer bannerSort;

    @Column(name = "banner_status")
    private Boolean bannerStatus;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;


}
