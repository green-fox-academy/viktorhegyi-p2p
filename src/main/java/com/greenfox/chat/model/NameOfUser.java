package com.greenfox.chat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-17.
 */
@Entity
@Component
public class NameOfUser {

  private String nameOfUser;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  public NameOfUser(String nameOfUser) {
    this.nameOfUser = nameOfUser;
  }

  public NameOfUser() {

  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNameOfUser() {
    return nameOfUser;
  }

  public void setNameOfUser(String nameOfUser) {
    this.nameOfUser = nameOfUser;
  }

  public long getId() {
    return id;
  }

  @Override
  public String toString() {
    return nameOfUser;
  }

}
