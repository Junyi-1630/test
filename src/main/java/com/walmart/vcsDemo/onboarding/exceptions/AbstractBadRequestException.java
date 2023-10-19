package com.walmart.vcsDemo.onboarding.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public abstract class AbstractBadRequestException extends RuntimeException{

    public AbstractBadRequestException() {
    }

    public abstract int getErrorCode();

    public abstract HttpStatus getHttpStatus();

    public abstract String getErrorMessage();


}
