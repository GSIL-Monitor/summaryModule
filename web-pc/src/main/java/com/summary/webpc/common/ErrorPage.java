package com.summary.webpc.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dengshengyu on 2018/5/8
 */
@Controller
public class ErrorPage {

   /* @RequestMapping(value = "/error/{code}")
    public String error(@PathVariable int code, Model model) {
        String pager = "/content/error-pager";
        switch (code) {
            case 404:
                model.addAttribute("code", 404);
                pager = "/content/error-pager";
                break;
            case 500:
                model.addAttribute("code", 500);
                pager = "/content/error-pager";
                break;
        }
        return pager;
    }*/
}
