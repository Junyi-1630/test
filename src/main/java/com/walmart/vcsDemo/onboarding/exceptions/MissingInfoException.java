package com.walmart.vcsDemo.onboarding.exceptions;

import org.springframework.http.HttpStatus;

import static com.walmart.vcsDemo.onboarding.common.util.ExceptionConstants.MISSING_INFO;

public class MissingInfoException extends AbstractBadRequestException{

    private final String missingField;

    public MissingInfoException(String missingField) {
        super();
        this.missingField = missingField;
    }
    @Override
    public int getErrorCode() {
        return MISSING_INFO;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getErrorMessage() {
        return String.format("%s is missing", missingField);
    }

}
