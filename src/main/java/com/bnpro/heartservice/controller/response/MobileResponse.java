package com.bnpro.heartservice.controller.response;


import com.bnpro.heartservice.controller.response.base.BasicResponse;

public class MobileResponse<T> extends BasicResponse {

    private T detail;

    public MobileResponse(String statusCode, String statusMessage) {
        super(statusCode, statusMessage);
        this.detail = null;
    }

    public MobileResponse(String statusCode, String statusMessage, T detail) {
        super(statusCode, statusMessage);
        this.detail = detail;
    }

    public T getDetail() { return this.detail; }
    public void setDetail(T detail) { this.detail = detail; }
}
