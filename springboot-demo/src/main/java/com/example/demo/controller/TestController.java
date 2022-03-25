package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/app")
public class TestController {

    @Resource
    UserDao userDao;

//    private static final org.apache.log4j.Logger log4jLogger = org.apache.log4j.Logger.getLogger(TestController.class);
    private static final Logger log4j2Logger = LogManager.getLogger(TestController.class);
    private static final org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/test")
    @ResponseBody
    public String testDemo() {
//        log4jLogger.info("log4j1 info {}", 123);
        log4j2Logger.info("log4j2 info {}", 123);
        slf4jLogger.info("slf4j info");
        return "Hello World!";
    }

    @RequestMapping("/user/{id}")
    @ResponseBody
    public User getUser(@PathParam("id") Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}