package com.fortune.fortune.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    BAD_REQUEST("400", "잘못된 요청입니다."),
    ACCESS_DENIED("403", "해당 요청에 접근 권한이 없습니다."),
    NOT_FOUND("404", "해당 리소스를 찾을 수 없습니다."),
    SERVER_ERROR("500", "서버 내부에서 알 수 없는 오류가 발생했습니다.");

    private final String code;
    private final String message;

}
