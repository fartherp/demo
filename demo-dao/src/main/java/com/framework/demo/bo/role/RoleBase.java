/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.role;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;
import java.util.Date;

/**
 * This class corresponds to the database table `tb_role`
 */
public abstract class RoleBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_role`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_role`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增ID";

    /**
     * This field corresponds to the database column `tb_role`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `tb_role`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `tb_role`.name
     */
    private static final String PROPERTY_REMARK_NAME = "角色名";

    /**
     * This field corresponds to the database column `tb_role`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `tb_role`.create_time
     */
    private static final String PROPERTY_CREATETIME = "createTime";

    /**
     * This field corresponds to the database column `tb_role`.create_time
     */
    private static final String PROPERTY_REMARK_CREATETIME = "创建时间";

    /**
     * This field corresponds to the database column `tb_role`.create_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATETIME)
    private Date createTime;

    /**
     * This method returns the value of the database column `tb_role`.id
     *
     * @return the value of `tb_role`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_role`.id
     *
     * @param id the value for `tb_role`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_role`.name
     *
     * @return the value of `tb_role`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `tb_role`.name
     *
     * @param name the value for `tb_role`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `tb_role`.create_time
     *
     * @return the value of `tb_role`.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column `tb_role`.create_time
     *
     * @param createTime the value for `tb_role`.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}