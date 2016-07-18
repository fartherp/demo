/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.user;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.user.User;
import com.framework.demo.dto.user.UserDto;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
@SqlMapper
public interface UserMapper extends DaoMapper<User, Integer> {

    User findUserByMap(Map<String, Object> params);

    List<UserDto> findPageUser(Map<String, Object> params);
}