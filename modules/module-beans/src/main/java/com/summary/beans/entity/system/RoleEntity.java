package com.summary.beans.entity.system;

import com.summary.base.BaseEntity;
import lombok.Data;

/**
 * Created by dengshengyu on 2018/5/14
 */
@Data
public class RoleEntity extends BaseEntity{

    // 主键
    private Long id;

    private Long rootId;

    // 角色名称
    private String roleName;

    // 角色备注
    private String roleRemark;



}
