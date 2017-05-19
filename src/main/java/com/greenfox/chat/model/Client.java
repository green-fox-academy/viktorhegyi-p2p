package com.greenfox.chat.model;

/**
 * Created by Viktor on 2017-05-18.
 */
public class Client {

  private String id;

  public Client(String id) {
    this.id = id;
  }

  public Client() {

  }

  public String getId() {
    return id;
  }

  public void setId(Message message) {
    this.id = message.getUsername();
  }

  public void setId(String id) {
    this.id = id;
  }

}
