package com.funtl.spring.security.oauth2.server.configure;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.funtl.spring.security.oauth2.server.tb.entity.Permission;
import com.funtl.spring.security.oauth2.server.tb.entity.User;
import com.funtl.spring.security.oauth2.server.tb.service.PermissionService;
import com.funtl.spring.security.oauth2.server.tb.service.UserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: QiPeng
 * @version: 1.0.0
 * @description: TODO
 * @createTime: 2020-03-15 10:04:00
 */

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private PermissionService permissionService;

    /**
     * @author: QiPeng
     * @description: TODO
     * @createTime: 2020-03-15 14:41:00
     * @param: s
     * @return: UserDetails
     * @throws: UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.getOne(new QueryWrapper<User>().eq(User.COL_USERNAME, s));
        List<GrantedAuthority> grantedAuthorityList = Lists.newArrayList();
        if (ObjectUtils.isNotEmpty(user)) {
            List<Permission> permissionList = permissionService.selectByUserId(user.getId());
            if (CollectionUtils.isNotEmpty(permissionList)) {
                permissionList.forEach(permission -> {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getEnname());
                    grantedAuthorityList.add(grantedAuthority);
                });
            }
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorityList);
        }
        return null;
    }
}
