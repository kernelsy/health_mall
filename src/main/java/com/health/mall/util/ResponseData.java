package com.health.mall.util;

import lombok.Data;

@Data
public class ResponseData {

    private Object data;

    private Integer status;

    private String msg;

    private Integer count;
}
