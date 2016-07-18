/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.user;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.user.User;
import com.framework.demo.dto.user.UserDto;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
public interface UserDao extends SqlMapDao<User, Integer> {

    User findUserByMap(Map<String, Object> params);

    List<UserDto> findPageUser(Map<String, Object> params);
}