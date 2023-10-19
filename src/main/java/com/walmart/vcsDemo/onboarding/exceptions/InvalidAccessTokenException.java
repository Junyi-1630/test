package com.walmart.vcsDemo.onboarding.exceptions;

import org.springframework.http.HttpStatus;

import static com.walmart.vcsDemo.onboarding.common.util.ExceptionConstants.INVALID_ACCESS_TOKEN;

public class InvalidAccessTokenException extends AbstractBadRequestException{

    private static final String MESSAGE = "Access token invalid";
    @Override
    public int getErrorCode() {
        return INVALID_ACCESS_TOKEN;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.UNAUTHORIZED;
    }

    @Override
    public String getErrorMessage() {
        return MESSAGE;
    }
}
