package com.funtl.spring.security.oauth2.resource.tb.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.funtl.spring.security.oauth2.resource.tb.entity.ContentCategory;
import com.funtl.spring.security.oauth2.resource.tb.mapper.ContentCategoryMapper;
import com.funtl.spring.security.oauth2.resource.tb.service.ContentCategoryService;
@Service
public class ContentCategoryServiceImpl extends ServiceImpl<ContentCategoryMapper, ContentCategory> implements ContentCategoryService{

}
