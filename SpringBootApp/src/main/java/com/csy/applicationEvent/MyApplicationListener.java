package com.csy.applicationEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.out.println("接收到事件:"+myApplicationEvent.getClass());
    }
}
