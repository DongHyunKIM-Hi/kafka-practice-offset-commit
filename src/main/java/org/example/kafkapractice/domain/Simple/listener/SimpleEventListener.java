package org.example.kafkapractice.domain.Simple.listener;

import lombok.extern.slf4j.Slf4j;
import org.example.kafkapractice.domain.Simple.model.kafka.SimpleEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SimpleEventListener {

    @KafkaListener(
        topics = "simple-events",
        groupId = "simple-event-group",
        containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consume(SimpleEvent event) {
        log.info("받은 이벤트: {}", event);
    }
}
