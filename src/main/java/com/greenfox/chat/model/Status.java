package com.greenfox.chat.model;

import com.greenfox.chat.service.JsonService;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-18.
 */
@Component
public class Status extends JsonService{

  private String status;

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

}
