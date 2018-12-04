package com.health.mall.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "city")
@Data
public class City implements Serializable {

    @Id
    private Integer id;

    @Column(name = "city_id")
    private String cityId;

    @Column(name = "city")
    private String City;

    @Column(name = "province_id")
    private String provinceId;

}
