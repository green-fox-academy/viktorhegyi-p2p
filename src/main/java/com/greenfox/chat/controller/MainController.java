package com.greenfox.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Viktor on 2017-05-17.
 */
@Controller
public class MainController {

  @RequestMapping("/")
  public String index() {
    return "index";
  }
}
