package org.example.config;

import org.example.pool.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.messaging.MessageChannel;

@Configuration
public class RouterConfig {

  @Bean("PollingTest")
  public MessageChannel pollingTest() {
    return new QueueChannel(10);
  }

  @Bean
  public IntegrationFlow route() {
    return IntegrationFlow.from("PoolGateway")
        .route((Message message) -> message.getClass().getSimpleName())
        .get();
  }
}
