package com.lanou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.entity.AuthUser;
import com.lanou.mapper.AuthUserMapper;
import com.lanou.service.AuthService;

@Service
public class AuthUserServiceImpl implements AuthService {

	@Resource
	private AuthUserMapper authUserMapper;
	
	@Override
	public List<AuthUser> selectAll() {
		return authUserMapper.selectAll();
	}

}
