package com.ricardo.pruebaconsumer.msvc_consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageListener {

    private static final Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "devs4j-topic", groupId = "devs4j-consumer-group")
    public void listen(String message) {
        log.info("Received message: {}", message);
    }

}
