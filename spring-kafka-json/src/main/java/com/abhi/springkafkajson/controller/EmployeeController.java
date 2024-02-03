package com.abhi.springkafkajson.controller;

import com.abhi.springkafkajson.broker.JsonKafkaProducer;
import com.abhi.springkafkajson.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")

public class EmployeeController {

    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody Employee employee){
        jsonKafkaProducer.sendMessage(employee);
        return ResponseEntity.ok("json message sent to the topic");
    }
}
