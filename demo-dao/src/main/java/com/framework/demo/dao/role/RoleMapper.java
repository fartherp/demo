/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.role;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.role.Role;

/**
 * This class corresponds to the database table `tb_role`
 */
@SqlMapper
public interface RoleMapper extends DaoMapper<Role, Integer> {
}