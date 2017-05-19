package com.greenfox.chat.model;

import com.greenfox.chat.service.JsonService;

/**
 * Created by Viktor on 2017-05-18.
 */
public class Json extends JsonService {

  Message message;
  Client client;

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Json() {
  }
}
