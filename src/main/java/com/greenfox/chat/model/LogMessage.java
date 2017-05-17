package com.greenfox.chat.model;

import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-17.
 */
@Component
public class LogMessage {

  String path;
  String method;
  String date;
  String logLevel;
  String requestData;

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  public String getRequestData() {
    return requestData;
  }

  public void setRequestData(String requestData) {
    this.requestData = requestData;
  }

//  public LogMessage() {
//  }
//
//  public void logMessage(String path, String method, String logLevel,
//      String requestData) {
//    this.path = path;
//    this.method = method;
//    this.date = LocalDateTime.now();
//    this.logLevel = logLevel;
//    this.requestData = requestData;
//  }
//
//  public String dateFormatter(LocalDateTime date) {
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
//    String formatDateTime = date.format(formatter);
//    return formatDateTime;
//  }
//
//  @Override
//  public String toString() {
//    return dateFormatter(date) + "  " + logLevel + " " + path + " " + method + requestData;
//  }
}
