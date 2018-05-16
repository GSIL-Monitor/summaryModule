package com.summary.webpc.service;

import com.summary.beans.entity.system.MenuEntity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by dengshengyu on 2018/5/14
 */
public interface MenuService {
    List<MenuEntity> selectMenu();
}
