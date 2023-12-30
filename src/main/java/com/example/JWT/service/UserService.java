package com.example.JWT.service;

import com.example.JWT.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    List<User> list = new ArrayList<User>();

    public UserService(List<User> list) {
        list.add(new User(UUID.randomUUID().toString(),"Sahil SHarma","sharmasahil2017@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(),"Salman Khan","Salmankhan@gmail.com"));
        this.list = list;
    }

    public List<User> getAllUser(){
        return list;
    }
}
