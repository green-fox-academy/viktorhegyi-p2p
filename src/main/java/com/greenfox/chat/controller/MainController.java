package com.greenfox.chat.controller;

import com.greenfox.chat.model.User;
import com.greenfox.chat.service.LogMessageService;
import com.greenfox.chat.service.UserRepo;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * Created by Viktor on 2017-05-17.
 */
@Controller
public class MainController {

  @Autowired
  LogMessageService logMessageService;

  @Autowired
  UserRepo userRepo;

  @ModelAttribute
  private void logInfo(HttpServletRequest httpServletRequest) {
    logMessageService.getInfo(httpServletRequest);
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index() {
    return "index";
  }

  @RequestMapping(value = "/enter", method = RequestMethod.GET)
  public String register() {
    return "enter";
  }

  @PostMapping(value = "/add")
  public String addUser(String username) {
    userRepo.save(new User(username));
    return "redirect:/";
  }

}
