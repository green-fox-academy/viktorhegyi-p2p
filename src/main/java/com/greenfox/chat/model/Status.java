package com.greenfox.chat.model;

import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-18.
 */
@Component
public class Status {

  private String status;

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

}
