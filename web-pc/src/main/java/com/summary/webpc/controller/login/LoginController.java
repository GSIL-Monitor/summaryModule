package com.summary.webpc.controller.login;

import com.summary.beans.entity.system.AdminEntity;
import com.summary.beans.entity.system.MenuEntity;
import com.summary.webpc.common.BaseController;
import com.summary.webpc.service.LoginService;
import com.summary.webpc.service.AdminService;
import com.summary.webpc.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("login")
//@ResponseBodya
public class LoginController extends BaseController{

    @Autowired
    private AdminService adminService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private MenuService menuService;

    //获取properties里面的值测试
//    @Value("${spring.EmailUtildatasource.username}")
//    String name;

    /**
     * 登录页面
     * @return
     */
    @RequestMapping(value = {"/",""})
    public String login(){
        return "login";
    }

    /**
     * 主页
     */
    @RequestMapping(value = {"/index"})
    public String index(Model model){
        List<MenuEntity> menuEntities = menuService.selectMenu();
        requestSucceed(menuEntities);
        model.addAttribute("menu", menuEntities);

        return "index";
    }

    /**
     * 找回密码
     * @return
     */
    @RequestMapping(value = {"/forgetPwd"})
    public String forgetPwd(){
        return "forgetPwd";
    }


    /**
     * 发送验证码
     * @param request
     * @return
     */
    @RequestMapping(value = "/validateCode", method = RequestMethod.POST)
    @ResponseBody
    public Map validateCode(HttpServletRequest request){
        String userEmail = request.getParameter("userEmail");
        System.out.println(userEmail);
        Map map = new HashMap<>();
        loginService.validateCode(request,userEmail);
        return map;
    }

    /**
     * 验证登录名与密码是否正确
     * @param request
     * @return
     */
    @RequestMapping("verify")
    @ResponseBody
    public HashMap verify(HttpServletRequest request){
        String userName = request.getParameter ("userName");
        String password = request.getParameter ("password");

        AdminEntity adminEntity = new AdminEntity();
        adminEntity.setPassWord("admin");
        adminEntity.setUserName("admin");
        HashMap hashMap = adminService.get(adminEntity);
        System.out.println(hashMap);
        return adminService.get(adminEntity);
    }



    @RequestMapping("registerUser")
    public String registerUser(){
        return "registerUser";
    }


    @RequestMapping("saveUser")
    public HashMap saveUser(HttpServletRequest request ){
        System.out.println ("---saveUser---");
        String userName = request.getParameter ("userName");
        System.out.println (userName);
        return null;
    }
}
