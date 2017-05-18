package com.greenfox.chat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Viktor on 2017-05-17.
 */
@Entity
public class NameOfUser {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String nameOfUser;

  public String getNameOfUser() {
    return nameOfUser;
  }

  public void setNameOfUser(String nameOfUser) {
    this.nameOfUser = nameOfUser;
  }

  public long getId() {
    return id;
  }

  public NameOfUser(String nameOfUser) {
    this.nameOfUser = nameOfUser;
  }
}
