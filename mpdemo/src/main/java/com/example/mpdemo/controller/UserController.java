package com.example.mpdemo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mpdemo.entity.User;
import com.example.mpdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired      //自动注入
    private UserMapper userMapper;

    @GetMapping("/user/findAll")
    public List<User> find(){ return userMapper.selectAllUserAndOrders();}

    @GetMapping("/user")
    public List query(){

        List<User> list = userMapper.selectList(null);
        System.out.println(list);
        return list;
    }

//    条件查询
    @GetMapping("/user/find")
    public List<User> findByCond(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username","zhangsan");
        return userMapper.selectList(queryWrapper);
    }

    //分页查询
    @GetMapping("/user/findByPage")
    public IPage findByPage(){
        //设置起始值及每页条数
        Page<User> page = new Page<>(2,2);
        IPage iPage = userMapper.selectPage(page, null);

        return iPage;
    }

    @PostMapping("/user")
    public String save(User user){

        int i = userMapper.insert(user);
        System.out.println(user);
        if(i > 0){
            return "插入成功";
        }else {
            return "插入失败";
        }
    }

}
