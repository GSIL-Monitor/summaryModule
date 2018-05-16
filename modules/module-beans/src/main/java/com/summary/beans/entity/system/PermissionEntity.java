package com.summary.beans.entity.system;

import com.summary.base.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 菜单角色关联关系
 *
 * @author dengshengyu on 2018/5/14
 */
@Data
public class PermissionEntity extends BaseEntity {

    // 主键
    private Long id;

    // 角色Id
    private Long roleId;

    // 菜单Id
    private Long menuId;



}