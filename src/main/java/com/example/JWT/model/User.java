package com.example.JWT.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    String UserId;
    String UserName;
    String UserEmail;

    public User(String userId, String userName, String userEmail) {
        UserId = userId;
        UserName = userName;
        UserEmail = userEmail;
    }
}
