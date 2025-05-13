package com.fortune.fortune.service;

import com.fortune.fortune.common.exception.CustomException;
import com.fortune.fortune.common.exception.ErrorCode;
import com.fortune.fortune.domain.User;
import com.fortune.fortune.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Transactional
    public User findUser(UUID id){
        User user = userRepository.findOne(id);
        if (user == null) {
            throw new CustomException(ErrorCode.NOT_FOUND);
        }
        return user;
    }

    public List<User> findUsers(){
        return userRepository.findAll();
    }

}
