package com.Monty.Ecommerce.User.Controller;

import com.Monty.Ecommerce.User.Entity.User;
import com.Monty.Ecommerce.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    UserService userService;


    //get all users
    @GetMapping("/user")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }


    // get user by id
    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getUserId(@PathVariable UUID userId){
        return userService.getUserId(userId);
    }

    // get user by name
    @GetMapping("/user/{loginUsername}")
    public List<User> getUserByName(@PathVariable String loginUsername) {

        return userService.getUserByName(loginUsername);
    }

   // create user
    @PostMapping("/user")
   public User createUser(@RequestBody User user) {

        return userService.createUser(user);
   }

   // update user
   @PutMapping("/user/{userId}")
   public ResponseEntity<User> updateUser(@PathVariable UUID userId,@RequestBody User userDetails) {

        return userService.updateUser(userId,userDetails);
   }

   // delete user
   @DeleteMapping("/user/{userId}")
   public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable UUID userId) {

        return userService.deleteUser(userId);
   }


  //  delete all users
  @DeleteMapping("/user")
    public ResponseEntity<Map<String, Boolean>> deleteAllUser() {
        return userService.deleteAllUser();
    }




    }