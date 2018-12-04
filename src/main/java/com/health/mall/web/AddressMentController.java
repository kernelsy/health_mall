package com.health.mall.web;


import com.health.mall.po.AddressMent;
import com.health.mall.service.AddressMentService;
import com.health.mall.util.ResponseData;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(description = "address-API")
@RestController
@RequestMapping("/api/address")
public class AddressMentController {

    private static final Logger log = LoggerFactory.getLogger(AddressMentController.class);


    @Autowired
    AddressMentService addressMentService;


    /**
     * save to address
     * @param addressMent
     * @return
     */
    @PostMapping("/save")
    public ResponseData save(@RequestBody AddressMent addressMent){
        log.info("addressMent:{}",addressMent);
        ResponseData data = new ResponseData();
        AddressMent address ;
        //id为null时,执行添加;否则,进行修改
        if (addressMent.getId()!=null){
            address = addressMentService.update(addressMent);
            data.setStatus(0);
            data.setMsg("修改成功!");
        }else {
            address = addressMentService.save(addressMent);
            data.setStatus(0);
            data.setMsg("添加成功!");
        }
        data.setData(address);
        return data;
    }



    @GetMapping("/getAll")
    public List<AddressMent> getAll(){
        List<AddressMent> list = addressMentService.getAll();
        log.info("list:{}",list);
        if (list==null){
            return new ArrayList<>();
        }else {
            return list;
        }
    }


    /**
     * select  address  of memberCode
     * @param memberCode
     * @return
     */
    @GetMapping("/getAddress/{memberCode}")
    public ResponseData getAll(@PathVariable String memberCode){
        ResponseData data = new ResponseData();
        List<AddressMent> list = addressMentService.getAddressByMemberCode(memberCode);
        log.info("list:{}",list);
        if (list==null){
            data.setData(new ArrayList<>());
            data.setStatus(1);
            data.setCount(0);
            data.setMsg("暂无信息!");
        }else {
            data.setData(list);
            data.setCount(list.size());
            data.setMsg("查询成功!");
            data.setStatus(0);
        }
        return data;
    }


}
