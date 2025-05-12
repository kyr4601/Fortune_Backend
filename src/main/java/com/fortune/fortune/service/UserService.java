package com.fortune.fortune.service;

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
    public User fineOne(UUID id){
        return userRepository.findOne(id);
    }

    public List<User> findUsers(){
        return userRepository.findAll();
    }

}
