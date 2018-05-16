package com.summary.beans.entity.system;

import com.summary.base.BaseEntity;
import lombok.Data;

/**
 * Created by dengshengyu on 2018/5/14
 */
@Data
public class MenuEntity extends BaseEntity {

    // 主键
    private Long id;

    // 父Id
    private Long pid;

    // 菜单名称
    private String name;

    private String nameZh;

    // 菜单链接
    private String url;

    // 排序
    private Integer sort;

    // 类型 1:目录, 2:页面, 3:按钮, 4:链接
    private String type;

    // 状态 0:删除, 1:正常, 2:未启用
    private Integer state;

    // 请求方法 post get delete put
    private String method;

    // 菜单样式
    private String style;

    // 菜单图案
    private String image;

    // 备注
    private String remark;




}
