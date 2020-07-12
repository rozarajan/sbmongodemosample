package com.prft.sbrestmongo.application.repository;
  
    import org.springframework.data.mongodb.repository.MongoRepository;

import com.prft.sbrestmongo.model.UserDTO;
  
  public interface UserRepository extends
  MongoRepository<UserDTO,String>{
  
  }
 