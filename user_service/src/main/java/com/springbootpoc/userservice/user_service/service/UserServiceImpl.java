package com.springbootpoc.userservice.user_service.service;

import com.springbootpoc.userservice.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

        private static List<User> userList= new ArrayList<User>();

        static{
            userList.add(new User(123L,"abc","12345"));
            userList.add(new User(456L,"pqr","54321"));
            userList.add(new User(789L,"xyz","67891"));
        }


    @Override
    public User getUsersList(Long userId) {
        User userdata= userList.stream().filter(user->user.getUserId().equals(userId)).findAny().get();
        return userdata;
    }
}
