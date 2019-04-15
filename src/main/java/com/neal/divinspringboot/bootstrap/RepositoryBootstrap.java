package com.neal.divinspringboot.bootstrap;

import com.neal.divinspringboot.repository.MyFirstLevelRepository;
import com.neal.divinspringboot.repository.MySecondLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 仓储的引导类
 */

@ComponentScan(basePackages="com.neal.divinspringboot.repository")
public class RepositoryBootstrap {
    /**
     *  psvm
     * @param args
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new  SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        MyFirstLevelRepository myFirstLevelRepository = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);
        MySecondLevelRepository mySecondLevelRepository = context.getBean("mySecondLevelRepository", MySecondLevelRepository.class);

        System.out.println(myFirstLevelRepository);
        System.out.println(mySecondLevelRepository);
        context.close();
    }
}
