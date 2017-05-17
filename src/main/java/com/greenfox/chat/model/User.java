package com.greenfox.chat.model;

import javax.persistence.Entity;

/**
 * Created by Viktor on 2017-05-17.
 */
@Entity
public class User {

  private String username;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User(String username) {
    this.username = username;
  }

  public User() {
  }

}
