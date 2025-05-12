package com.fortune.fortune.common.response;

import lombok.Getter;

@Getter
public class BaseResponse<T> {
    private final boolean isSuccess;
    private final String code;
    private final String message;
    private final T data;

    public BaseResponse(boolean isSuccess, String code, String message, T data) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(true, "200", "호출에 성공하였습니다.", data);
    }

    public static <T> BaseResponse<T> fail(String code, String message) {
        return new BaseResponse<>(false, code, message, null);
    }

    public static <T> BaseResponse<T> fail(String code, String message, T data) {
        return new BaseResponse<>(false, code, message, data);
    }

}
