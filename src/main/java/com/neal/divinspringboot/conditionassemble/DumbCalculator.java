package com.neal.divinspringboot.conditionassemble;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Profile("dump")
@Component
public class DumbCalculator implements Calculator {
    @Override
    public void print(List l) {
        for (int i = 0; i < l.size(); i++)
            System.out.println("Dump : "+l.get(i));
    }
}
