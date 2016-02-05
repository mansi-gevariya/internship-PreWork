package com.example.controller;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * Created by mansi.pattani on 5/2/16.
 */
@EnableMongoRepositories("com.example.repository")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody Map<String, Object> userMap, HttpServletRequest request, HttpServletResponse response){
        User user=new User(userMap.get("name").toString(),userMap.get("password").toString());
        List<User> foundUser=userRepository.findByName(userMap.get("name").toString());
        if(!foundUser.isEmpty())
        {
            response.setStatus( HttpServletResponse.SC_BAD_REQUEST  );
            return null;
        }
        userRepository.save(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{userName}")
    public User getUserDetails(@PathVariable("userName") String userName, HttpServletRequest request, HttpServletResponse response) {
        List<User> users=userRepository.findByName(userName);
        if(users.size()>0)
            return users.get(0);
        else {
            response.setStatus(404);
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{userId}")
    public User putUserDetails(@RequestBody Map<String, Object> userMap, @PathVariable("userId") String userId, HttpServletRequest request, HttpServletResponse response){
        User user=userRepository.findOne(userId);
        if(user.getId()==null)
        {
            response.setStatus(404);
        }
        user.setName(userMap.get("name").toString());
        user.setPassword(userMap.get("password").toString());
        userRepository.save(user);
        return user;
    }
}
