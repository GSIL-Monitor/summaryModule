package com.summary.webpc.service.impl;

import com.summary.beans.entity.AdminEntity;
import com.summary.webpc.mapper.AdminMapper;
import com.summary.webpc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by dengshengyu on 2017/7/19.
 */
@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public HashMap get(AdminEntity adminEntity){
        HashMap map = new HashMap<> ();
        Integer verify = adminMapper.verify (adminEntity);
        if (verify > 0){
            map.put ("msg","success");
        }else{
            map.put ("msg","error");
        }
        return map;
    }



}
