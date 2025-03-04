package com.home.employeeCrud.EmployeeCrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TecktalikException extends RuntimeException {
    

    private static final long serialVersionUID=1L;

    public TecktalikException(String message){
        super(message);
    }

}
