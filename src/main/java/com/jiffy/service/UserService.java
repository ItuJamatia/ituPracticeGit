package com.jiffy.service;

import com.jiffy.payload.UserDto;

public interface UserService {

	void signup(UserDto userDto);

	UserDto signin(String email, String password);

	boolean authenticateUser(String email, String password);

}
