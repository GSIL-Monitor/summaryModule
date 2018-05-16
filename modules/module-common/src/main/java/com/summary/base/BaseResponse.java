package com.summary.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dengshengyu on 2017/8/7.
 */
@Data
public class BaseResponse<T> implements Serializable {

    private Boolean success;

    private String code;

    private String message;

    private T data;

}
