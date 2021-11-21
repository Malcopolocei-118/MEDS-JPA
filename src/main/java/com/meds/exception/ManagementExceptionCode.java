package com.meds.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ManagementExceptionCode extends RuntimeException{

    private final ExceptionCode exceptionCode;

    public ManagementExceptionCode(ExceptionCode exceptionCode) {
        super(exceptionCode.getDescription());
        this.exceptionCode = exceptionCode;
    }
}
