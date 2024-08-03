package com.krisitiyan.kafka.consumer;

import com.krisitiyan.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(
//            topics = "roiti",
//            groupId = "myGroup"
//    )
//    public void consumerMessage(String message) {
//        log.info(format("Consuming the message from roiti Topic:: %s", message));
//    }

    @KafkaListener(
            topics = "roiti",
            groupId = "myGroup"
    )
    public void consumerMessage(Student student) {
        log.info(format("Consuming the message from roiti Topic:: %s", student.toString()));
    }

}
