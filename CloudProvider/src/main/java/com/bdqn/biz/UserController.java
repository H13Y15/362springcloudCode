package com.bdqn.biz;

import com.bdqn.Espojo._source;
import com.bdqn.dao.AppInfoMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    AppInfoMapper dao;

    @RequestMapping("Data")
    public Object getlist()
    {
        System.out.println("进入了Data方法");
        return dao.list();
    }

    @RequestMapping("/sayHello")
    public String sayhello(){
        return "I`m provider 1 ,Hello consumer!";
    }
    @RequestMapping("/sayHi")
    public String sayHi(){
        return "I`m provider 1 ,Hello consumer!";
    }
    @RequestMapping("/sayHaha")
    public String sayHaha(){
        return "I`m provider 1 ,Hello consumer!";
    }
}
