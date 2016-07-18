/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.role;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.bo.role.Role;
import com.framework.demo.dao.role.RoleDao;
import com.framework.demo.service.role.RoleService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_role`
 */
@Service("roleService")
public class RoleServiceImpl extends GenericSqlMapServiceImpl<Role, Integer> implements RoleService {
    @Resource(name = "roleDao")
    private RoleDao roleDao;

    @Override
    public SqlMapDao<Role, Integer> getDao() {
        return roleDao;
    }
}