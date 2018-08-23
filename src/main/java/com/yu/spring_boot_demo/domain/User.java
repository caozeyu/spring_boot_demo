package com.yu.spring_boot_demo.domain;

/**
* @Description:     用户模型
* @Author:           Czy
* @CreateDate:      2018/8/1 21:11
* @Version:         1.0
* @Params:
* @Return:
**/
public class User {

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
