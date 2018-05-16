package com.summary.webpc.service.impl;

import com.summary.beans.entity.system.MenuEntity;
import com.summary.webpc.mapper.MenuMapper;
import com.summary.webpc.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by dengshengyu on 2018/5/14
 */
@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    public  MenuMapper menuMapper;

    public Long roleId = Long.valueOf(7);

    @Override
    public List<MenuEntity> selectMenu() {
        List<MenuEntity> menuEntities = menuMapper.selectMenu(roleId);
        return menuEntities;
    }
}
