package com.greenfox.chat.service;

import com.greenfox.chat.model.Message;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Viktor on 2017-05-18.
 */
public interface MessageRepo extends CrudRepository<Message, Long> {

}
