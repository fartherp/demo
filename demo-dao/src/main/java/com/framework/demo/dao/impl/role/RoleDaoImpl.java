/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.role;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.bo.role.Role;
import com.framework.demo.dao.role.RoleDao;
import com.framework.demo.dao.role.RoleMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `tb_role`
 */
@Repository("roleDao")
public class RoleDaoImpl extends ConfigurableBaseSqlMapDao<Role, Integer> implements RoleDao {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public DaoMapper<Role, Integer> getDaoMapper() {
        return roleMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}