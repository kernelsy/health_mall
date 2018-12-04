package com.health.mall.service;


import com.health.mall.po.AddressMent;
import com.health.mall.repository.AddressMentRepository;
import com.health.mall.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class AddressMentService {

    @Autowired
    AddressMentRepository addressMentRepository;

    public AddressMent getAddressById(String id){
        return addressMentRepository.getById(id);
    }

    public AddressMent save(AddressMent addressMent){
        addressMent.setAccount(Account.account);
        addressMent.setCreateTime(new Date());
        return addressMentRepository.save(addressMent);
    }

    public List<AddressMent> getAll(){
        return addressMentRepository.findAll();
    }

    public List<AddressMent> getAddressByMemberCode(String memberCode) {
        return addressMentRepository.findAddressByMemberCode(memberCode);
    }

    public AddressMent update(AddressMent addressMent) {
        addressMent.setUpdateTime(new Date());
        return addressMentRepository.save(addressMent);
    }
}
