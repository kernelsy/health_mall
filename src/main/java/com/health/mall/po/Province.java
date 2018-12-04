package com.health.mall.po;




import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="province")
@Data
public class Province implements Serializable {



    @Id
    private Integer id;

    @Column(name = "province_id")
    private String provinceId;

    @Column(name = "province")
    private String province;


}
