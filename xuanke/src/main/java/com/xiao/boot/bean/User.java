package com.xiao.boot.bean;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private Integer type;

    public String getUsername() {
        return username;
    }
}
