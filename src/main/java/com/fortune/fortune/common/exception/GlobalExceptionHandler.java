package com.fortune.fortune.common.exception;

import com.fortune.fortune.common.response.BaseResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//컨트롤러에서 발생하는 에러를 다 이곳에서 처리
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public BaseResponse<?> handleCustomException(CustomException e){
        return BaseResponse.fail(e.getCode(), e.getMessage());
    }

    /*예상못한 나머지 예외 처리*/
    @ExceptionHandler(Exception.class)
    public BaseResponse<?> handleException(Exception e){
        return BaseResponse.fail("INTERNAL_SERVER_ERROR", "예상치 못한 오류가 발생했습니다.");
    }

}
