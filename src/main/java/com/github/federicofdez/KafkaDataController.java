package com.github.federicofdez;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class KafkaDataController {

    @MessageMapping("/newData")
    @SendTo("/topic/kafkaData")
    public KafkaData forwardData(KafkaData data) throws Exception {
        return new KafkaData(data.getContent());
    }

}
