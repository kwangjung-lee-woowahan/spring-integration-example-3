package org.example.pool;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.stereotype.Component;

@Component
@MessagingGateway(
    defaultRequestChannel = "PoolGateway"
)
public interface PoolGateway {

  void request(Message message);
}
