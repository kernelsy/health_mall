package com.health.mall.service.dto;

import com.health.mall.po.Member;
import lombok.Data;

import java.util.Date;

@Data
public class MemberDTO extends Member {


    private Date startTime;

    private Date endTime;
}
