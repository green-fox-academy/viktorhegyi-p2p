package com.greenfox.chat.service;

import com.greenfox.chat.model.LogMessage;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-17.
 */
@Component
public class LogMessageService {

  @Autowired
  LogMessage logMessage;

  private void setLogMessageDateAndTime() {
    logMessage.setDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
  }

  private void setLogMessageMethod(HttpServletRequest httpServletRequest) {
    logMessage.setMethod(httpServletRequest.getMethod());
  }

  private void setLogMessagePath(HttpServletRequest httpServletRequest) {
    logMessage.setPath(httpServletRequest.getRequestURI());
  }

  private void setLogMessageRequestData(HttpServletRequest httpServletRequest) {
    logMessage.setRequestData(httpServletRequest.getQueryString());
  }

  private void setLogMessageLevel(String levelInfo) {
    logMessage.setLogLevel(levelInfo);
  }

  private void createLogMessage(HttpServletRequest httpServletRequest) {
    setLogMessagePath(httpServletRequest);
    setLogMessageMethod(httpServletRequest);
    setLogMessageDateAndTime();
    setLogMessageLevel("INFO");
    setLogMessageRequestData(httpServletRequest);
  }

  public void getInfo(HttpServletRequest httpServletRequest) {
    createLogMessage(httpServletRequest);
    String infoString = logMessage.getDate() + " " +
        logMessage.getLogLevel() + " Request " +
        logMessage.getPath() + " " +
        logMessage.getMethod() + " " +
        logMessage.getRequestData();
    System.out.println(infoString);
  }

}
