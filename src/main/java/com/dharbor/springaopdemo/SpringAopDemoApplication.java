package com.dharbor.springaopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:beans.xml")
@SpringBootApplication
public class SpringAopDemoApplication {

    @Autowired
    Employee employee;

    @Autowired
    Account account;

    public static void main(String[] args) {
        SpringApplication.run(SpringAopDemoApplication.class, args);
    }

    @Bean
    public void verification(){
        System.out.println("id " + employee.getId());
        System.out.println("name " + employee.getName());
        System.out.println("contact " + employee.getContact());
    }

    @Bean
    public void account(){
        account.deposit();
        account.withdraw();
        account.balanceCheck();
    }

}
