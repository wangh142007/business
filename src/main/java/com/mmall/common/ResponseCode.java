package com.mmall.common;

import org.springframework.web.bind.annotation.ResponseBody;

public enum ResponseCode {

    SUCCESS(0, "SUCCESS"),
    ERROR(1, "ERROR"),
    NEED_LOGIN(2, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(3, "ILLEGAL_ARGUMENT");

    private final int CODE;
    private final String DESC;

    ResponseCode(int code, String desc) {
        this.CODE = code;
        this.DESC = desc;
    }

    public int getCode() {
        return CODE;
    }

    public String getDesc() {
        return DESC;
    }
}
