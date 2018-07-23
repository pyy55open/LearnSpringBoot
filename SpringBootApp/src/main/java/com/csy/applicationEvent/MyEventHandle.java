package com.csy.applicationEvent;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandle {

    /**
     * 任意参数，不能为空
     * @param o
     */
    @EventListener
    public void event(Object o){
        System.out.println("MyEventHandle 接收到事件："+ o.getClass());
    }

    @EventListener
    public void event2(ContextStoppedEvent event){
        System.out.println("事件停止:"+ event.getClass());
    }
}
