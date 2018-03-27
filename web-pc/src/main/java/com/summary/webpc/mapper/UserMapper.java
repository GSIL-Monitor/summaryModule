package com.summary.webpc.mapper;

import com.summary.webpc.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by deng on 2017/7/14.
 */
@Repository
public interface UserMapper {
    Integer verify(UserEntity user);

    List<UserEntity> getAll();
}
