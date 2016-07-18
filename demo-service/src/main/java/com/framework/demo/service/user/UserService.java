/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.user;

import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.bo.user.User;
import com.framework.demo.dto.user.UserDto;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
public interface UserService extends GenericService<User, Integer> {

    User findUserByMap(Map<String, Object> params);

    List<UserDto> findPageUser(Map<String, Object> params);
}