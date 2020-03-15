package com.funtl.spring.security.oauth2.resource.tb.controller;

import com.funtl.spring.security.oauth2.resource.dto.ResponseResult;
import com.funtl.spring.security.oauth2.resource.tb.entity.Content;
import com.funtl.spring.security.oauth2.resource.tb.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: QiPeng
 * @version: 1.0.0
 * @description: TODO
 * @createTime: 2020-03-15 15:22:00
 */
@RestController
public class ContentController {

    @Autowired
    private ContentService contentService;

    @GetMapping("/")
    public ResponseResult<List<Content>> list() {
        return new ResponseResult<List<Content>>(HttpStatus.OK.value(), HttpStatus.OK.toString(), contentService.list());
    }
}
