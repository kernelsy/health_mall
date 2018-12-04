package com.health.mall.repository;

import com.health.mall.po.AddressMent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressMentRepository extends JpaRepository<AddressMent,Long>, JpaSpecificationExecutor<AddressMent> {

    AddressMent getById(String id);

    List<AddressMent> findAddressByMemberCode(String memberCode);
}
