package com.health.mall.po;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "user_role")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
@Data
public class UserRole implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_power")
    private String rolePower;

    @Column(name = "role_status")
    private Boolean roleStatus;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
