package com.example.jwtdemo.controller;


import com.example.jwtdemo.entity.User;
import com.example.jwtdemo.utils.JwtUtils;
import com.example.jwtdemo.utils.Result;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        String token = JwtUtils.generateToken(user.getUsername());
        return Result.ok().data("token", token);
    }

    @GetMapping("/info")
    public Result info(String token){
        String username = JwtUtils.getClaimsByToken(token).getSubject();
        String url = "";
        return Result.ok().data("name", username).data("avatar", url);
    }

    @PostMapping("/logout")
    public Result logout(){
        return Result.ok();
    }


}
