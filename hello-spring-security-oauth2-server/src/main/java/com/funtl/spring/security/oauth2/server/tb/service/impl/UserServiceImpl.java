package com.funtl.spring.security.oauth2.server.tb.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.funtl.spring.security.oauth2.server.tb.entity.User;
import com.funtl.spring.security.oauth2.server.tb.mapper.UserMapper;
import com.funtl.spring.security.oauth2.server.tb.service.UserService;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
