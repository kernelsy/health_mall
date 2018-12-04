package com.health.mall.service;


import com.health.mall.po.Banner;
import com.health.mall.repository.BannerRepository;
import com.health.mall.po.Account;
import io.netty.util.internal.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class BannerService {

    private static final Logger log = LoggerFactory.getLogger(BannerService.class);

    @Autowired
    BannerRepository bannerRepository;


    public Banner save(Banner banner){
        banner.setAccount(Account.account);
        banner.setCreateTime(new Date());
        return bannerRepository.save(banner);
    }



    public Page<Banner> pageBanner(Integer pageNo,Integer pageSize,Banner banner){
        Pageable pageable = new PageRequest(pageNo, pageSize, Sort.Direction.ASC, "bannerSort");
        Page<Banner> bannerPage = bannerRepository.findAll(new Specification<Banner>(){
            public Predicate toPredicate(Root<Banner> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<>();
                log.info("status:{},title:{}",banner.getBannerStatus(),banner.getBannerTitle());
                if (banner!=null){
                    if (StringUtil.isNullOrEmpty(banner.getBannerTitle())){
                        list.add(criteriaBuilder.like(root.get("bannerTitle"), "%"+banner.getBannerTitle()+"%"));
                    }
                    if (banner.getBannerStatus()!=null){
                        list.add(criteriaBuilder.equal(root.get("bannerStatus"), banner.getBannerStatus()));
                    }
                }
                Predicate[] p = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(p));
            }
        },pageable);
        return bannerPage;
    }

    /**public Page<Banner> getAll(Pageable pageable,Boolean bannerStatus){
        if (bannerStatus!=null){
            return bannerRepository.findAllByBannerStatus(bannerStatus);
        }
        return bannerRepository.findAll(pageable);
    }*/


    public List<Banner> getBanner(){
        return bannerRepository.findBannersByBannerStatus(true);
    }

    public Banner update(Banner banner) {
        banner.setUpdateTime(new Date());
        return bannerRepository.save(banner);
    }
}
