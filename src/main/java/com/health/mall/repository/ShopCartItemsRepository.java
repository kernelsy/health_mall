package com.health.mall.repository;

import com.health.mall.po.ShopCartItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopCartItemsRepository extends JpaRepository<ShopCartItems,Long>, JpaSpecificationExecutor<ShopCartItems> {
}
