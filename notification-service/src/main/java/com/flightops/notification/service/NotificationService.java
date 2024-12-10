package com.flightops.notification.service;

import com.flightops.notification.dto.NotificationDTO;

public interface NotificationService {
    void sendNotification(NotificationDTO notificationDTO);
}
