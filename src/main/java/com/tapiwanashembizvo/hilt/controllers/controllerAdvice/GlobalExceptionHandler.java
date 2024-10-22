package com.tapiwanashembizvo.hilt.controllers.controllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tapiwanashembizvo.hilt.services.core.exception.BusinessNameEmailCombinationExistsException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessNameEmailCombinationExistsException.class)
    public ResponseEntity<ErrorResponse> handleBusinessUnitAlreadyExistsException(BusinessNameEmailCombinationExistsException ex) {
        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), HttpStatus.CONFLICT.value());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }
}
