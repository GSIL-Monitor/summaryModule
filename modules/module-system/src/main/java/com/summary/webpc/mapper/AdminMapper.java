package com.summary.webpc.mapper;

import com.summary.beans.entity.system.AdminEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by deng on 2017/7/14.
 */
@Repository
@Mapper
public interface AdminMapper {
    //登录验证
    Integer verify(AdminEntity user);


    List<AdminEntity> getAll();
}
