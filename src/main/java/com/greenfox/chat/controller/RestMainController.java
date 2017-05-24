package com.greenfox.chat.controller;

import com.greenfox.chat.model.Json;
import com.greenfox.chat.model.Message;
import com.greenfox.chat.model.Status;
import com.greenfox.chat.repository.MessageRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Viktor on 2017-05-17.
 */
@RestController
public class RestMainController {

  @Autowired
  MessageRepo messageRepo;

  @CrossOrigin("*")
  @PostMapping("/api/message/receive")
  public Status jsonInput(@RequestBody Json json) {
    List<String> errors = new ArrayList<>();
    Status status = new Status();

    if (StringUtils.isEmpty(json.getMessage().getText())) {
      errors.add("message.text");
    }
    if (StringUtils.isEmpty(json.getMessage().getUsername())) {
      errors.add("message.username");
    }
    if (StringUtils.isEmpty(json.getMessage().getTimestamp())) {
      errors.add("message.timestamp");
    }
    if (StringUtils.isEmpty(json.getMessage().getId())) {
      errors.add("message.id");
    }
    if (StringUtils.isEmpty(json.getClient().getId())) {
      errors.add("client.id");
    }

    if (errors.size() == 0) {
      status.setStatus("ok");
      messageRepo.save(json.getMessage());
    } else {
      status.setStatus("error");
      status.setErrorMessage(errors);
    }
    return status;
  }

}
