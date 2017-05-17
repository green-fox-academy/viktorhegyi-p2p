package com.greenfox.chat.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.springframework.stereotype.Component;
import sun.util.resources.LocaleData;

/**
 * Created by Viktor on 2017-05-17.
 */
@Component
public class LogMessage {

  String path;
  String method;
  LocalDateTime date;
  String logLevel;
  String requestData;

  public LogMessage() {
  }

  public void logMessage(String path, String method, String logLevel,
      String requestData) {
    this.path = path;
    this.method = method;
    this.date = LocalDateTime.now();
    this.logLevel = logLevel;
    this.requestData = requestData;
  }

  public String dateFormatter(LocalDateTime date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    String formatDateTime = date.format(formatter);
    return formatDateTime;
  }

  @Override
  public String toString() {
    return dateFormatter(date) + "  " + logLevel + " " + path + " " + method + requestData;
  }
}
