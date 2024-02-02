package org.example.config;

import java.util.function.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.aggregator.AggregatingMessageHandler;
import org.springframework.integration.annotation.CorrelationStrategy;
import org.springframework.integration.dsl.AggregatorSpec;
import org.springframework.integration.dsl.IntegrationFlow;

@Configuration
public class AggregatorConfig {

  public IntegrationFlow aggregator() {
    return IntegrationFlow.from("aa")
        .aggregate(new AggregatorSpecConsumer())
        .get();
  }

  public AggregatingMessageHandler messageHandler() {

  }

  @CorrelationStrategy
  public

  public static class AggregatorSpecConsumer implements Consumer<AggregatorSpec> {

    @Override
    public void accept(AggregatorSpec aggregatorSpec) {
      aggregatorSpec
          .correlationStrategy()
    }
  }
}
