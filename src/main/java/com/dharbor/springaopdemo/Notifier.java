package com.dharbor.springaopdemo;

import org.aspectj.lang.JoinPoint;

public class Notifier {

    public void log(JoinPoint joinPoint){
        System.out.println("account is accessed");
    }
}
