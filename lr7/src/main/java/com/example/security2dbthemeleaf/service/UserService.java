package com.example.security2dbthemeleaf.service;

import com.example.security2dbthemeleaf.dto.UserDto;
import com.example.security2dbthemeleaf.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
