package com.school.notifdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NotifdemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(NotifdemoApplication.class, args);
        var manager = context.getBean(NotificationManager.class);
        manager.sendNotif("Hello World!");

    }



    }


