package com.walmart.vcsDemo.onboarding.dto.exceptions;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ErrorDetailDto {
    private Date timestamp;
    private String message;
    private int errorCode;
    private HttpStatus httpStatus;

    public ErrorDetailDto() {
    }

    public ErrorDetailDto(Date timestamp, String message, int errorCode) {
        this.timestamp = timestamp;
        this.message = message;
        this.errorCode = errorCode;
    }

    public ErrorDetailDto(Date timestamp, String message, int errorCode, HttpStatus httpStatus) {
        this.timestamp = timestamp;
        this.message = message;
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
