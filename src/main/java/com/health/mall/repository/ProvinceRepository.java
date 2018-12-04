package com.health.mall.repository;

import com.health.mall.po.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProvinceRepository extends JpaRepository<Province,Long> {

    Province findByProvince(String province);
}
