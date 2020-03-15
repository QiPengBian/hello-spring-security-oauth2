package com.funtl.spring.security.oauth2.resource.tb.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.funtl.spring.security.oauth2.resource.tb.entity.Content;
import com.funtl.spring.security.oauth2.resource.tb.mapper.ContentMapper;
import com.funtl.spring.security.oauth2.resource.tb.service.ContentService;
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements ContentService{

}
