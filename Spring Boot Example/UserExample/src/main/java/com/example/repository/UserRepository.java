package com.example.repository;

import com.example.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by mansi.pattani on 5/2/16.
 */
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByName(String name);
}
