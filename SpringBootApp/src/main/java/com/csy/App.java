package com.csy;

import com.csy.applicationEvent.MyApplicationEvent;
import com.csy.applicationEvent.MyApplicationListener;
import com.csy.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.jws.soap.SOAPBinding;

/**
 * 自定义事件监听，继承ApplicationListener<>，指定自定义类
 * 监听器加入spring容器
 * ConfigurableApplicationContext.publishEvent发布监听
 *
 * 配置监听器，将监听器交给spring管理
 * application.properties配置context.listener.classes
 * 监听类@EventListener注解，方法上使用，该类注入spring容器管理
 */


//@EnableAsync
//@Import({User.class,VipUser.class})
//@Import(MyImportSelector.class)
//@ComponentScan
//@EnableLog(name = "hahahaha")
@EnableAutoConfiguration(exclude = User.class)
@SpringBootApplication
public class App {


    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(App.class,args);
        SpringApplication app = new SpringApplication(App.class);
//        app.addListeners(new MyApplicationListener());
        ConfigurableApplicationContext context = app.run(args);
        System.out.println(context.getBean(User.class));
        context.publishEvent(new MyApplicationEvent(new Object()));
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduleConfig.class);
//        System.out.println(context.getBean(User.class));
//        System.out.println(context.getBean(VipUser.class));
        context.stop();//触发ContextStoppedEvent事件停止
//        context.close();
    }
}
