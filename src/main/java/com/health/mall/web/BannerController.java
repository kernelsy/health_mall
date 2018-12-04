package com.health.mall.web;


import com.health.mall.po.Banner;
import com.health.mall.service.BannerService;
import com.health.mall.util.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Api(description = "Banner-API")
@RestController
@RequestMapping("/api/banner")
public class BannerController {

    private static final Logger log = LoggerFactory.getLogger(BannerController.class);


    @Autowired
    BannerService bannerService;

    /**
     * save to banner
     * @param banner
     * @return
     */
    @PostMapping("/save")
    @ApiOperation(value = "保存banner信息" ,  notes="保存banner信息")
    public ResponseData save(@RequestBody Banner banner){
        log.info("banner:{}",banner);
        ResponseData data = new ResponseData();
        if (banner.getId()!=null){
            data.setData(bannerService.update(banner));
            data.setStatus(0);
            data.setMsg("修改成功!");
        }else {
            data.setData(bannerService.save(banner));
            data.setStatus(0);
            data.setMsg("添加成功!");
        }
        return data;
    }

    /**
     * getAll of banner
     * @return
     */
    @GetMapping("/getAll/{pageNo}/{pageSize}")
    @ApiOperation(value = "分页查询banner" ,  notes="分页查询banner")
    public ResponseData getAll(@RequestParam(required = false) Boolean bannerStatus,
                               @RequestParam(required = false) String bannerTitle,
                               @PathVariable Integer pageNo,
                               @PathVariable Integer pageSize){
        //log.info("pageable:{},status:{}",pageable,bannerStatus);
        log.info("pageNo:{},pageSize:{},bannerStatus:{},bannerTitle:{}",pageNo,pageSize,bannerStatus,bannerTitle);
        ResponseData data = new ResponseData();
        Banner banner = new Banner();
        banner.setBannerStatus(bannerStatus);
        banner.setBannerTitle(bannerTitle);
        Page<Banner> page = bannerService.pageBanner(pageNo,pageSize,banner);
        log.info("page:{}",page);
        if (page==null){
            data.setData(new ArrayList<>());
            data.setStatus(1);
            data.setCount(0);
            data.setMsg("暂无信息");
        }else {
            if (page.getContent()==null){
                data.setData(new ArrayList<>());
                data.setStatus(1);
                data.setCount(0);
                data.setMsg("暂无信息");
            }else {
                data.setCount(page.getTotalPages());
                data.setData(page);
                data.setStatus(0);
                data.setMsg("查询成功");
            }
        }
        return data;
    }

    /**
     * bannerStatus is true
     * @return
     */
    @GetMapping("/getBanner")
    @ApiOperation(value = "查询首页显示的banner图" ,  notes="查询首页显示的banner图")
    public ResponseData getBannerList(){
        ResponseData data = new ResponseData();
        List<Banner> list = bannerService.getBanner();
        log.info("list:{}",list);
        if (list==null){
            data.setData(new ArrayList<>());
            data.setStatus(1);
            data.setMsg("暂无信息");
        }else {
            data.setData(list);
            data.setStatus(0);
            data.setMsg("查询成功");
        }
        return data;
    }

    /**
     * delete of banner
     * @return
     */
    /**@DeleteMapping("/delete/{id}")
    public List<Banner> deleteBanner(){
        return null;
    }*/
}
