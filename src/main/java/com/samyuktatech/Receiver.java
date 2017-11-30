package com.samyuktatech;

import java.util.concurrent.CountDownLatch;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {    

	
    public void receiveMessage(byte[] message) {
        System.out.println("Received <" + new String(message) + ">");
        
    }

}
