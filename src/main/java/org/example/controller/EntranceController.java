package org.example.controller;

import java.util.Map;
import org.example.controller.requests.MessageRequest;
import org.example.pool.AggregatorTest;
import org.example.pool.PollingTest;
import org.example.pool.PoolGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntranceController {

  private final PoolGateway gateway;

  public EntranceController(PoolGateway gateway) {
    this.gateway = gateway;
  }

  @PostMapping("/entrance")
  public Object entrance() {

    return Map.of();
  }

  @PostMapping("/polling-test")
  public Object pollingTest(@RequestBody MessageRequest request) {
    PollingTest message = new PollingTest(request.getNumber(), request.getValue());
    gateway.request(message);
    return Map.of();
  }

  @PostMapping("/aggregator-test")
  public Object aggregatorTest(@RequestBody MessageRequest request) {
    AggregatorTest message = new AggregatorTest(request.getNumber(), request.getValue());
    gateway.request(message);
    return Map.of();
  }

  @GetMapping("/exception-test")
  public Object exceptionTest() {
    return Map.of();
  }
}
