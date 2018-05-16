package com.summary.webpc.service;

import com.summary.beans.entity.system.AdminEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/7/19.
 */
@Service
public interface AdminService {
    HashMap get(AdminEntity user);
}
