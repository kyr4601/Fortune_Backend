package com.fortune.fortune.controller;

import com.fortune.fortune.common.response.BaseResponse;
import com.fortune.fortune.domain.User;
import com.fortune.fortune.dto.response.UserData;
import com.fortune.fortune.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping ("/nickname")
    public BaseResponse<UserData> getUserNickname(@RequestParam UUID id){
        User user = userService.findUser(id);
        UserData response = new UserData(user.getNickname());
        return BaseResponse.success(response);
    }
}
