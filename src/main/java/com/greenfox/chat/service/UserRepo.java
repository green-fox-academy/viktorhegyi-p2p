package com.greenfox.chat.service;

import com.greenfox.chat.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Viktor on 2017-05-17.
 */
public interface UserRepo extends CrudRepository<User, Long>{

  List<User> findByUser();

}
