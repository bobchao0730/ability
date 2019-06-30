package com.demo;

import org.springframework.stereotype.Component;
import com.demo.DecryptValue;
@Component
public class People {

    @DecryptValue(value = "${test.demo:王五}")
//    @DecryptValue(value = "${test.demo}")
    private String name = "张三";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println("我是"+name);
    }
}
