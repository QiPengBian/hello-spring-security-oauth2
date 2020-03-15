package com.funtl.spring.security.oauth2.server.tb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.funtl.spring.security.oauth2.server.tb.entity.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: QiPeng
 * @version: 1.0.0
 * @description: TODO
 * @createTime: 2020-03-15 14:31:00
 */
public interface PermissionMapper extends BaseMapper<Permission> {
    /**
     * @author: QiPeng
     * @description: TODO
     * @createTime: 2020-03-15 14:31:00
     * @param: userId
     * @return: List<Permission>
     */
    List<Permission> selectByUserId(@Param("userId") Long userId);
}