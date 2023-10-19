package com.walmart.vcsDemo.onboarding.exceptions;

import org.springframework.http.HttpStatus;

import static com.walmart.vcsDemo.onboarding.common.util.ExceptionConstants.RATE_LIMITED;

public class RateLimitedException extends AbstractBadRequestException{

    private static final String MESSAGE = "Access rate limited";
    @Override
    public int getErrorCode() {
        return RATE_LIMITED;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.TOO_MANY_REQUESTS;
    }

    @Override
    public String getErrorMessage() {
        return MESSAGE;
    }
    
}
