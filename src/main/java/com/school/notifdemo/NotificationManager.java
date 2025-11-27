package com.school.notifdemo;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    final NotificationService notificationService;
    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void sendNotif(String message){
        notificationService.sendMsg(message);
    }
}
