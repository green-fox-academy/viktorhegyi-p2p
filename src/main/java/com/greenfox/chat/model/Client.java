package com.greenfox.chat.model;

/**
 * Created by Viktor on 2017-05-18.
 */
public class Client {

  private String id = "viktorhegyi";

  public Client(String id) {
    this.id = id;
  }

  public Client() {

  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
