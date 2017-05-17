package com.greenfox.chat.controller;

import com.greenfox.chat.model.LogMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Viktor on 2017-05-17.
 */
@Controller
public class MainController {

  @Autowired
  LogMessage logMessage;

  @RequestMapping("/")
  public String index() {
    logMessage.logMessage("/", "Get", "INFO", "");
    System.out.println(logMessage);
    return "index";
  }
}
