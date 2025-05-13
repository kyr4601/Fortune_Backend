package com.fortune.fortune.common.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
    private final String code;

    public CustomException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

}
