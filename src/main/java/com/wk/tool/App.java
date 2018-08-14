package com.wk.tool;

import com.wk.tool.annotation.Getter;

/**
 * Created by wangkang04 on 2018/8/14
 **/
@Getter
public class App {
    private String name;

    private String value;

    public App(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
