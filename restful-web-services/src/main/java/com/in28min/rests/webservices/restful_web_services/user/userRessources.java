package com.in28min.rests.webservices.restful_web_services.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userRessources {

    private userDaoService service;

    public userRessources(userDaoService service){
       this.service = service;
    } 

    //GET /user
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }  
    
    //GET /user/{id}
    @GetMapping("/users/{id}")
    public User retrieveUsers(@PathVariable int id){
        return service.findUsersById(id);
    }

}
