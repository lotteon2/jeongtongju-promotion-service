package com.jeontongju.coupon.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CouponProducer<T> {

  private final KafkaTemplate<String, T> kafkaTemplate;

  public void sendUpdateStock(String topicName, T data) {
    kafkaTemplate.send(topicName, data);
  }

  public void sendRollbackPoint(String topicName, T data) {
    kafkaTemplate.send(topicName, data);
  }
}
