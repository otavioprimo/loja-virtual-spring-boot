package com.codebrain.lojavirtual.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = 2799530955906239085L;

    /**
     * AdcServices Exception com String
     * 
     * @param str
     */
    public UserServiceException(String str) {
        super(str);
    }

    /**
     * AdcServices Exception com throwable
     * 
     * @param throwable
     */
    public UserServiceException(Throwable throwable) {
        super(throwable);
    }

    /**
     * AdcServices Exception com String e Throwable
     * 
     * @param message
     * @param cause
     */
    public UserServiceException(String message, Throwable cause) {
        super(message, cause);
    }

}