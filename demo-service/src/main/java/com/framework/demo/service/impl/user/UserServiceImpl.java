/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.user;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.bo.user.User;
import com.framework.demo.dao.user.UserDao;
import com.framework.demo.dto.user.UserDto;
import com.framework.demo.service.user.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
@Service("userService")
public class UserServiceImpl extends GenericSqlMapServiceImpl<User, Integer> implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public SqlMapDao<User, Integer> getDao() {
        return userDao;
    }

    @Override
    public User findUserByMap(Map<String, Object> params) {
        return userDao.findUserByMap(params);
    }

    @Override
    public List<UserDto> findPageUser(Map<String, Object> params) {
        return userDao.findPageUser(params);
    }
}