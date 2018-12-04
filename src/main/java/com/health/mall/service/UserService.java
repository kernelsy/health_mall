package com.health.mall.service;


import com.health.mall.po.User;
import com.health.mall.repository.UserRepository;
import io.netty.util.internal.StringUtil;
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
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User create(User user){
        user.setCreateTime(new Date());
        return user;
    }

    public User update(User user){
        user.setUpdateTime(new Date());
        return user;
    }

    public Page<User> getAll(Integer pageNo,Integer pageSize,User user){
        PageRequest pageRequest = new PageRequest(pageNo,pageSize);
        Specification<User> specification = new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<>();
                if (user!=null){
                    if (!StringUtil.isNullOrEmpty(user.getUserName())){
                        list.add(criteriaBuilder.like(root.get("userName"),"%"+user.getUserName()+"%"));
                    }
                    if (user.getUserStatus()!=null){
                        list.add(criteriaBuilder.equal(root.get("userStatus"),user.getUserStatus()));
                    }
                }
                Predicate[] p = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(p));
            }
        };
        Page<User> page = userRepository.findAll(specification,pageRequest);
        return page;
    }

}
