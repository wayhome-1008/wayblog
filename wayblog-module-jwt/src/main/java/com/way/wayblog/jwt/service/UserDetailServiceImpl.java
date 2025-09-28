package com.way.wayblog.jwt.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *@Author: way
 *@CreateTime: 2025-09-28  15:25
 *@Description: TODO
 */
@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 从数据库中查询
        // ...

        // 暂时先写死，密码为 quanxiaoha, 这里填写的密文，数据库中也是存储此种格式
        // authorities 用于指定角色，这里写死为 ADMIN 管理员
        return User.withUsername("way")
                .password("$2a$10$57tBsdK7QRHZlvixvsooweHOfPB2OL53xwACaicwhDKUWZ8hpHReW")
                .authorities("ADMIN")
                .build();
    }
}
