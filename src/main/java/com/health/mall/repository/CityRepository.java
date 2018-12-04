package com.health.mall.repository;

import com.health.mall.po.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {


    List<City> getAllByProvinceId(String provinceId);
}
