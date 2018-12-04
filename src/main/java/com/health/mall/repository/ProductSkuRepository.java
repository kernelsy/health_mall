package com.health.mall.repository;

import com.health.mall.po.ProductSku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSkuRepository extends JpaRepository<ProductSku,Long>, JpaSpecificationExecutor<ProductSku> {
}
