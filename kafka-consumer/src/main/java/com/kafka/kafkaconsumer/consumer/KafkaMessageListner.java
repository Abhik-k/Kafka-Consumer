package com.kafka.kafkaconsumer.consumer;

import com.kafka.kafkaconsumer.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListner {

    Logger logger = LoggerFactory.getLogger(KafkaMessageListner.class);

    @KafkaListener(topics = "java-techie-4",groupId = "jt-group-new")
    public void consumer(Customer customer) {
        logger.info("Consumer consume the customer object {}",customer.toString());
    }

//    @KafkaListener(topics = "java-techie-3",groupId = "jt-group")
//    public void consume1(String message){
//        logger.info("Consumer1 consume the message {}",message);
//    }
//
//    @KafkaListener(topics = "java-techie-3",groupId = "jt-group")
//    public void consume2(String message){
//        logger.info("Consumer2 consume the message {}",message);
//    }
//
//    @KafkaListener(topics = "java-techie-3",groupId = "jt-group")
//    public void consume3(String message){
//        logger.info("Consumer3 consume the message {}",message);
//    }
}
