package com.summary.beans.entity;

import com.summary.base.BaseEntity;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by dengshengyu on 2018/3/29
 */
@Data
public class AdminEntity extends BaseEntity{

    private Long id;

    private Long roleId;

    private String nickname;

    private String userName;

    private String passWord;

    private String passwordSalt;

    private String phone;

    private Integer state;

    /*private String avatar;

    private String lastLoginIp;

    private LocalDateTime lastLoginDate;*/
}
