package com.summary.webpc.controller.briefIntroduction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dengshengyu on 2018/5/8
 */
@Controller
@RequestMapping("BriefIntroduction")
public class BriefIntroduction {

    @RequestMapping("BriefIntroduction")
    public String BriefIntroduction(){
        return "briefIntroduction/briefIntroduction";
    }
}
