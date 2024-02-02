package org.example.pool;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
public class AggregatorTestComponent {

  @ServiceActivator(inputChannel = "AggregatorTest")
  public void handle(AggregatorTest message) {

  }
}
