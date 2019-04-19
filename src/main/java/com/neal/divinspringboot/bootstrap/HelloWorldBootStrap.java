package com.neal.divinspringboot.bootstrap;

import com.neal.divinspringboot.annotation.EnableHelloWorld;
import com.neal.divinspringboot.repository.MyFirstLevelRepository;
import com.neal.divinspringboot.repository.MySecondLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableHelloWorld
public class HelloWorldBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= new  SpringApplicationBuilder(HelloWorldBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String hello = context.getBean("helloWorld", String.class);
        System.out.println(hello);
        context.close();
    }
}
