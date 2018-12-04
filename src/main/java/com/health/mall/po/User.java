package com.health.mall.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "pass_words")
    private String passWord;

    @Column(name = "user_role")
    private String userRole;

    @Column(name = "last_login_ip")
    private String lastLoginIP;

    @Column(name = "last_login_time")
    private Date lastLoginTime;

    @Column(name = "user_status")
    private Boolean userStatus;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
