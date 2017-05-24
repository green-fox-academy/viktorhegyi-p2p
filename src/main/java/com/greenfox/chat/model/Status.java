package com.greenfox.chat.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-18.
 */
@Component
@JsonInclude(Include.NON_NULL)
public class Status {

  private String status;
  private String message;

  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setErrorMessage(List<String> message) {
    this.message = "Missing field(s): ";
    for (String entry : message) {
      this.message += entry + ", ";
    }
    this.message = this.message.substring(0, this.message.length() - 2);
  }

}
