package com.csy.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Component
public class MyEnviromentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        try (InputStream file = new FileInputStream("D:/repository/springBoot.properties")){
            Properties properties = new Properties();
            properties.load(file);
            PropertiesPropertySource source = new PropertiesPropertySource("my",properties);
            environment.getPropertySources().addLast(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
