package com.example.mpdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mpdemo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from t_user where id = #{id}")
    User selectById(int id);

    // 查询用户及所有订单信息
    @Select("select * from t_user")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "username", property = "username"),
            @Result(column = "password", property = "password"),
            @Result(column = "birthday", property = "birthday"),
            @Result(column = "id", property = "orders", javaType = List.class,
                    many = @Many(select = "com.example.mpdemo.mapper.OrderMapper.selectByUid"))
    })
    List<User> selectAllUserAndOrders();
}
