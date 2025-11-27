package com.school.notifdemo;

import org.springframework.stereotype.Service;

@Service("SMS")
public class SmsNotificationService implements NotificationService {

    @Override
    public void sendMsg(String msg) {
        System.out.println("SMS "+ msg);
    }
}
