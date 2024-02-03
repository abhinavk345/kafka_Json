package com.abhi.springkafkajson.broker;

import com.abhi.springkafkajson.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {

    @Value("${spring.kafka.topic.name}")
    private  String topicName;

    @Value("${spring.kafka.group.name}")
    private  String groupName;
    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.group.name}")
    public void consume(Employee employee){
        log.info(String.format("json message received >>%s ",employee.toString()));
    }

}
