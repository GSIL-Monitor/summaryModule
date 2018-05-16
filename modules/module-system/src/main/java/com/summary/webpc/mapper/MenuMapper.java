package com.summary.webpc.mapper;

import com.summary.beans.entity.system.MenuEntity;
import com.summary.webpc.service.MenuService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by dengshengyu on 2018/5/14
 */
@Mapper
public interface MenuMapper{

     List<MenuEntity> selectMenu(Long roleId);
}
