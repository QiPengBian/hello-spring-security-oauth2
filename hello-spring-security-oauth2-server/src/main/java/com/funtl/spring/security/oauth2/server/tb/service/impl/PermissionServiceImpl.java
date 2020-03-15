package com.funtl.spring.security.oauth2.server.tb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.funtl.spring.security.oauth2.server.tb.entity.Permission;
import com.funtl.spring.security.oauth2.server.tb.mapper.PermissionMapper;
import com.funtl.spring.security.oauth2.server.tb.service.PermissionService;

/**
 * @author: QiPeng
 * @version: 1.0.0
 * @description: TODO
 * @createTime: 2020-03-15 14:31:00
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    /**
     * @author: QiPeng
     * @description: TODO
     * @createTime: 2020-03-15 14:31:00
     * @param: userId
     * @return: List<Permission>
     */
    @Override
    public List<Permission> selectByUserId(Long userId) {
        return permissionMapper.selectByUserId(userId);
    }
}
