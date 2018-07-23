package com.csy.bean;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 1000)
    public void runSecond(){
        System.out.println("读秒器 "+dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 25 09 ? * *")
    public void timingTask(){
        System.out.println("现在是早上9点25分");
    }
}
