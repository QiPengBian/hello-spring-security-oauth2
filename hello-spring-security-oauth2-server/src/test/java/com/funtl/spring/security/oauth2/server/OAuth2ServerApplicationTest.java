package com.funtl.spring.security.oauth2.server;

import com.funtl.spring.security.oauth2.server.tb.entity.Permission;
import com.funtl.spring.security.oauth2.server.tb.service.PermissionService;
import com.funtl.spring.security.oauth2.server.tb.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: QiPeng
 * @version: 1.0.0
 * @description: TODO
 * @createTime: 2020-03-15 09:19:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OAuth2ServerApplicationTest {

    @Autowired
    private UserService userService;

    @Autowired
    private PermissionService permissionService;

    @Test
    public void encodeTest() {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }

    @Test
    public void userTest() {
        userService.list().forEach(System.out::print);
    }

    @Test
    public void permissionTest(){
        List<Permission> permissionList = permissionService.selectByUserId(1L);
        permissionList.forEach(System.out::print);
    }
}
