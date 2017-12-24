package com.dora.entity;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017-12-24.
 */
@Component
public class Student {
    private String name;
    private String id;
    private String sclass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }
}
