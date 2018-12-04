package com.health.mall.repository;

import com.health.mall.po.Banner;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerRepository extends JpaRepository<Banner,Long>, JpaSpecificationExecutor<Banner> {




    List<Banner> findBannersByBannerStatus(boolean bannerStatus);

}
