package com.csy.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.csy.bean")
@EnableScheduling
public class TaskScheduleConfig {
}
