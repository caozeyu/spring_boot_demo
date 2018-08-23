package com.yu.spring_boot_demo.controller;

import com.yu.spring_boot_demo.domain.User;
import com.yu.spring_boot_demo.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* @Description:
* @Author:
* @CreateDate:      2018/8/1 21:44
* @Version:         1.0
* @Params:
* @Return:
**/
@RestController
public class UserController {
    @Resource
    private UserRepository userRepository;

    private User user = new User();

    @RequestMapping(value = "/savePerson",method = RequestMethod.POST)
    public User savePerson(String name){
        user.setName(name);
        if(userRepository.save(user)){
            System.out.printf("用户对象：%s 保存成功！\n",user);
        }

        return user;
    }
}
