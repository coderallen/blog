package com.ca.blog.controller;

import com.ca.blog.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController extends BaseController {

    @RequestMapping(value = "/dept",method = RequestMethod.GET)
    public String index() {
        return "Dept List!";
    }

}
