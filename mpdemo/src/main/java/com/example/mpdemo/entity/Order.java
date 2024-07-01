package com.example.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;

public class Order {
    private int id;

    private int total;
    private String order_time;

    @TableField(exist = false)
    private User user;

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", total=" + total +
                ", order_time='" + order_time + '\'' +
                '}';
    }
}
