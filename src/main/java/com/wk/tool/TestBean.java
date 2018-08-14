package com.wk.tool;

import lombok.Builder;

/**
 * Created by wangkang04 on 2018/8/14
 **/
@Builder
public class TestBean {
    private Integer age;

    private Short sex;

    private String name;

    public static void main(String[] args) {
        TestBean bean = TestBean.builder().age(23).sex((short)1).name("wk").build();

    }
}
