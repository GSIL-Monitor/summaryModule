package com.summary.webpc.common;

import com.summary.base.BaseResponse;
import com.summary.beans.entity.system.AdminEntity;

import javax.security.auth.Subject;
import javax.servlet.http.HttpServletRequest;
//import org.apache.shiro.SecurityUtils;

/**
 * Created by dengshengyu on 2018/5/14
 */
public class BaseController {

    /*protected AdminEntity getLoginUser() {
        Subject subject = SecurityUtils.getSubject();
        AdminEntity admin = (AdminEntity) subject.getPrincipal();
        return admin;
    }
*/

    protected <T> BaseResponse requestSucceed(T data) {
        return generateResponse(Boolean.TRUE, null, null, data);
    }
    /**
     * 前端返回给视图的统一类 方便管理 json格式
     *
     * @param success
     * @param code
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    private <T> BaseResponse generateResponse(Boolean success, String code, String message, T data) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setSuccess(success);
        response.setCode(code);
        response.setMessage(message);
        response.setData(data);
        return response;
    }
}
