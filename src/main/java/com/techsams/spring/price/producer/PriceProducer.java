package com.techsams.spring.price.producer;

import com.techsams.spring.price.Price;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PriceProducer {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private KafkaTemplate<String, Price> kafkaTemplate;

    @Value("${price.kafka.producer.topic}")
    private String topic;

    public void publish(Price price) {
        LOG.info("Publishing price - {}", price);
        kafkaTemplate.send(topic, price);
    }
}
