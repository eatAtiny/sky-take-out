package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

public interface UserService {

    /**
     * 用户登录
     * @param userLoginDTO 登录参数
     * @return 登录成功返回用户信息
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
