package com.greenfox.chat.model;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-18.
 */
@Entity
@Component
public class Message {

  @Id
  private long id;
  private String text;
  private String username;
  private Timestamp timestamp;

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public long getId() {
    return id;
  }

  public void setId() {
    this.id = randomIdNumber();
  }

  public String getText() {
    return text;
  }

  public void setText(String message) {
    this.text = message;
  }

  public Message(String message) {
    this.text = message;
  }

  public int randomIdNumber() {
    int randomNumber = (1000000 + (int)(Math.random() * 9000000));
    return randomNumber;
  }

  public Message() {
  }

}
