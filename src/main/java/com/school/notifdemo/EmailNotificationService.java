package com.school.notifdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Email")
@Primary
public class EmailNotificationService implements NotificationService{
    @Override
    public void sendMsg(String msg) {
        System.out.println("Email "+ msg);

    }
}
