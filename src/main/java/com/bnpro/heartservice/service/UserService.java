package com.bnpro.heartservice.service;

import com.bnpro.heartservice.controller.response.MobileResponse;
import com.bnpro.heartservice.repository.UserRepository;
import com.bnpro.heartservice.repository.entity.User;
import com.bnpro.heartservice.service.model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public MobileResponse<UserDetail> register(String name, String password, String email) throws Exception {

        User user   = new User(name, password, email);
        User result = userRepository.save(user);

        UserDetail userDetail = new UserDetail(result.getName(), result.getEmail(), result.getCreatedDate());
        MobileResponse<UserDetail> response = new MobileResponse<UserDetail>("0", "success", userDetail);

        return response;
    }

}
