package com.xiao.boot.bean;

import lombok.Data;

@Data
public class Course {
    private String id;
    private String name;
    private Integer total;
    private Integer num;
    private String teacher;

    public void setNum(Integer num) {
        this.num = num;
    }
}
