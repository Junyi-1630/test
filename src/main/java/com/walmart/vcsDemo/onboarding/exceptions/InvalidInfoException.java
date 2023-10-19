package com.walmart.vcsDemo.onboarding.exceptions;

import org.springframework.http.HttpStatus;
import static com.walmart.vcsDemo.onboarding.common.util.ExceptionConstants.INVALID_INFO;

public class InvalidInfoException extends AbstractBadRequestException{

    private final String invalidField;

    public InvalidInfoException(String invalidField) {
        super();
        this.invalidField = invalidField;
    }

    private static final String MESSAGE = "Invalid information";
    @Override
    public int getErrorCode() {
        return INVALID_INFO;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getErrorMessage() {
        return String.format("%s has invalid value", invalidField);
    }

}
