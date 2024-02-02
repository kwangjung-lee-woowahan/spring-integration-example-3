package org.example.pool;

import java.time.LocalDateTime;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
public class PollingTestComponent {

  @ServiceActivator(
      inputChannel = "PollingTest",
      poller = @Poller(cron = "*/10 * * * * *")
//      poller = @Poller(fixedDelay = "10000")
//      poller = @Poller(fixedRate = "10000")
  )
  public void handle(PollingTest message) throws InterruptedException {
    Thread.sleep(100);
    System.out.println("[" + LocalDateTime.now() + "] " + message);
  }
}
