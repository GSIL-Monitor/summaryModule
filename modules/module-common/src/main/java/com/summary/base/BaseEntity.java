package com.summary.base;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author John.Wu on 2017/9/26.
 */
@Data
public class BaseEntity {

    // 创建人
    private String createUser;

    // 创建Ip
    private String createIp;

    // 创建时间
    private LocalDateTime createDate;

    // 上次修改人
    private String lastModifiedUser;

    // 上次修改Ip
    private String lastModifiedIp;

    // 上次修改时间
    private LocalDateTime lastModifiedDate;

}
