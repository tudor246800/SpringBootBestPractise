package com.neal.divinspringboot.conditionassemble;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Profile("smart")
@Component
public class SmartCalculator implements Calculator {

    @Override
    public void print(List l) {
        l.forEach(item -> System.out.println("Smart : " +item));
    }
}
