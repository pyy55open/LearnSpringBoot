package com.csy.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@ConfigurationProperties("ds")
public class ConnectionPro {

    private List<String> list = new ArrayList<>();

    private String[] ports;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getPorts() {
        return ports;
    }

    public void setPorts(String[] ports) {
        this.ports = ports;
    }

    @Override
    public String toString() {
        return "ConnectionPro{" +
                "list=" + list +
                "},prots{ ports="+Arrays.asList(ports) +"}";
    }
}
