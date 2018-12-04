package com.health.mall.repository;

import com.health.mall.po.ProductSpec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSpecRepository extends JpaRepository<ProductSpec,Long>, JpaSpecificationExecutor<ProductSpec> {
}
