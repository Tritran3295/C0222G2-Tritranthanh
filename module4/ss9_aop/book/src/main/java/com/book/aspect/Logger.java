package com.book.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    @AfterThrowing(value = "execution(*com.book.controller.HomeController.oder(..)")
    public String checkEx(){
        System.out.println("-------");
        System.out.println("Gap loi");
    }
    @After(value = "execution(*com.book.controller.HomeController.oder(..)")
    public void logOder(){
        System.out.println("--------");
        System.out.println("done");
    }
}
