package com.neal.divinspringboot.conditionassemble;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan
public class ProfileTestBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new SpringApplicationBuilder(ProfileTestBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("dump")
                .run(args);

        Calculator calculator = context.getBean(Calculator.class);

        calculator.print(Arrays.asList(new int[]{1,2,4,5}));
        context.close();
    }
}

