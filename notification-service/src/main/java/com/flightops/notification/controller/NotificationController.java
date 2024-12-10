package com.flightops.notification.controller;

import com.flightops.notification.dto.NotificationDTO;
import com.flightops.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public void sendNotification(@RequestBody NotificationDTO notificationDTO) {
        notificationService.sendNotification(notificationDTO);
    }
}
