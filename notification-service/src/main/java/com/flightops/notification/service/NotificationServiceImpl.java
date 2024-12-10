package com.flightops.notification.service;

import com.flightops.notification.dto.NotificationDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void sendNotification(NotificationDTO notificationDTO) {
        rabbitTemplate.convertAndSend("notificationExchange", "notificationRoutingKey", notificationDTO);
    }
}
