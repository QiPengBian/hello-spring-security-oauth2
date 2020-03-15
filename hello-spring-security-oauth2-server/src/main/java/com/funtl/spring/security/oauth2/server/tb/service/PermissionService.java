package com.funtl.spring.security.oauth2.server.tb.service;

import com.funtl.spring.security.oauth2.server.tb.entity.Permission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author: QiPeng
 * @version: 1.0.0
 * @description: TODO
 * @createTime: 2020-03-15 14:30:00
 */
public interface PermissionService extends IService<Permission> {

    /**
     * @author: QiPeng
     * @description: TODO
     * @createTime: 2020-03-15 14:30:00
     * @param: userId
     * @return: List<Permission>
     */
    List<Permission> selectByUserId(Long userId);

}
