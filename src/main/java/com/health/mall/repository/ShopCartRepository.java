package com.health.mall.repository;

import com.health.mall.po.ShopCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopCartRepository extends JpaRepository<ShopCart,Long>, JpaSpecificationExecutor<ShopCart> {
}
