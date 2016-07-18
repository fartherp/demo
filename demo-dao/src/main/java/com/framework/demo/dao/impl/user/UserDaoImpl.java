/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.user;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.bo.user.User;
import com.framework.demo.dao.user.UserDao;
import com.framework.demo.dao.user.UserMapper;
import com.framework.demo.dto.user.UserDto;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_user`
 */
@Repository("userDao")
public class UserDaoImpl extends ConfigurableBaseSqlMapDao<User, Integer> implements UserDao {
    @Autowired
    private UserMapper userMapper;

    @Override
    public DaoMapper<User, Integer> getDaoMapper() {
        return userMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    @Override
    public User findUserByMap(Map<String, Object> params) {
        return userMapper.findUserByMap(params);
    }

    @Override
    public List<UserDto> findPageUser(Map<String, Object> params) {
        return userMapper.findPageUser(params);
    }
}