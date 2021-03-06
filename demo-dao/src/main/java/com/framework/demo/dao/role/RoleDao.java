/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.role;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.role.Role;

/**
 * This class corresponds to the database table `tb_role`
 */
public interface RoleDao extends SqlMapDao<Role, Integer> {
}