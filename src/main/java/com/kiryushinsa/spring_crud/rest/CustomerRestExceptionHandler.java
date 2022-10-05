package com.kiryushinsa.spring_crud.rest;

import com.kiryushinsa.spring_crud.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> handleException (CustomerNotFoundException customerNotFoundException) {

        CustomerErrorResponse error = new CustomerErrorResponse(HttpStatus.NOT_FOUND.value(), customerNotFoundException.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> handleException (Exception exception) {

        CustomerErrorResponse error = new CustomerErrorResponse(HttpStatus.BAD_REQUEST.value(), exception.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }


}
