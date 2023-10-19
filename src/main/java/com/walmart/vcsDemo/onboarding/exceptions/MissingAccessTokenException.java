package com.walmart.vcsDemo.onboarding.exceptions;

import org.springframework.http.HttpStatus;

import static com.walmart.vcsDemo.onboarding.common.util.ExceptionConstants.MISSING_ACCESS_TOKEN;


public class MissingAccessTokenException extends AbstractBadRequestException{

    private static final String MESSAGE = "Access token expired";
    @Override
    public int getErrorCode() {
        return MISSING_ACCESS_TOKEN;
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
