package com.greenfox.chat.controller;

import com.greenfox.chat.model.Json;
import com.greenfox.chat.model.Status;
import com.greenfox.chat.service.JsonService;
import com.greenfox.chat.repository.MessageRepo;
import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Viktor on 2017-05-17.
 */
@RestController
public class RestMainController {

  @Autowired
  MessageRepo messageRepo;
  @Autowired
  Status status;

  @CrossOrigin("*")
  @PostMapping("/api/message/receive")
  public Status jsonInput(@RequestBody Json json) {
    messageRepo.save(json.getMessage());
    status.setStatus("ok");
    return status;
  }


}
