package com.health.mall.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "district")
@Data
public class District implements Serializable {



    @Id
    private Integer id;

    @Column(name = "district_id")
    private String districtId;

    @Column(name = "district")
    private String district;

    @Column(name = "city_id")
    private String cityId;
}
