package com.lanou.service;

import java.util.List;

import com.lanou.entity.AuthUser;

public interface AuthService {

    
    List<AuthUser> selectAll();
}
