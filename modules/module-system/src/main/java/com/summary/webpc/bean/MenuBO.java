package com.summary.webpc.bean;

import com.summary.beans.entity.system.MenuEntity;
import lombok.Data;

import java.util.List;

/**
 * 菜单BO
 *
 * @author John.Wu on 17/5/27.
 */
@Data
public class MenuBO {

    private MenuEntity node;

    private List<MenuBO> children;

    // 以下为冗余字段, 给前端构造zTree用的
    private String name;
    private Long id;
    private Long pid;
    private Boolean checked = Boolean.FALSE;

}