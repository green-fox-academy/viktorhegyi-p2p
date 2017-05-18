package com.greenfox.chat.model;

import javax.persistence.Entity;

/**
 * Created by Viktor on 2017-05-18.
 */
public class Message {

  private long id;
  private String message;
  private NameOfUser nameOfUser;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = randomIdNumber();
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Message(String message) {
    this.message = message;
  }

  public int randomIdNumber() {
    int randomNumber = (1000000 + (int)(Math.random() * 9999999));
    return randomNumber;
  }

  public Message(long id, String message, NameOfUser nameOfUser) {
    this.id = id;
    this.message = message;
    this.nameOfUser = nameOfUser;
  }
}
