package com.summary.webpc.entity;

import com.summary.webpc.enums.UserSexEnum;
import lombok.Data;

/**
 * Created by dengshengyu on 2017/7/14.
 */
@Data
public class UserEntity {
    private Long id;
    private String userName;
    private String passWord;
    private UserSexEnum gender;
}