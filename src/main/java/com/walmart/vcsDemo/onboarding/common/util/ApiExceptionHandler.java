package com.walmart.vcsDemo.onboarding.common.util;


import com.walmart.vcsDemo.onboarding.dto.exceptions.ErrorDetailDto;
import com.walmart.vcsDemo.onboarding.exceptions.AbstractBadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(AbstractBadRequestException.class)
    public ResponseEntity<ErrorDetailDto> handleBadRequestException(AbstractBadRequestException e) {

        HttpStatus httpStatus = e.getHttpStatus();
        int errorCode = e.getErrorCode();
        String errorMessage = e.getErrorMessage();

        ErrorDetailDto errorDetail = new ErrorDetailDto(new Date(), errorMessage, errorCode, httpStatus);

        return new ResponseEntity<>(errorDetail, httpStatus);
    }

}
