package com.bnpro.heartservice.controller.response.base;

public class BasicResponse {

	private String statusCode;
	private String statusMessage;

	public BasicResponse(String statusCode, String statusMessage) {
        this.statusCode    = statusCode;
        this.statusMessage = statusMessage;
    }

    public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

}
