package com.greenfox.chat.controller;

import com.greenfox.chat.model.LogMessage;
import com.greenfox.chat.service.LogMessageService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Viktor on 2017-05-17.
 */
@Controller
public class MainController {

  @Autowired
  LogMessageService logMessageService;

  @ModelAttribute
  private void logInfo(HttpServletRequest httpServletRequest) {
    logMessageService.getInfo(httpServletRequest);
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index() {
    return "index";
  }
}
