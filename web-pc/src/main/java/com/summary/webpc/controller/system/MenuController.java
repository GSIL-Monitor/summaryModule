package com.summary.webpc.controller.system;

import com.summary.base.BaseResponse;
import com.summary.beans.entity.system.MenuEntity;
import com.summary.webpc.common.BaseController;
import com.summary.webpc.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * Created by dengshengyu on 2018/5/14
 */
@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController {


    public String roleId = "7";

   @Autowired
    public MenuService menuService;

    /**
     *查询对应权限菜单
     * @return
     */
    @RequestMapping(value = "/selectMenu", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse selectMenu(){

        List<MenuEntity> menuEntities = menuService.selectMenu();

        requestSucceed(menuEntities);
        return requestSucceed(menuEntities);
    }

}
