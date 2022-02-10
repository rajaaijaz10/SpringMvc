package com.costaff.service;

import org.springframework.stereotype.Service;

@Service
public class LoginImplement implements LoginService{
    @Override
    public boolean authenticate(String username, String password) {
        return username.equals(password);
    }
}
