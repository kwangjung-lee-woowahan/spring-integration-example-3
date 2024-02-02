package org.example.pool;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Message {

  private final Integer number;
  private final Integer value;
  private final LocalDateTime createdAt;

  public Message(Integer number, Integer value) {
    this.number = number;
    this.value = value;
    this.createdAt = LocalDateTime.now();
  }
}
