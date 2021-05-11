package com.Monty.Ecommerce.User.Service;

import com.Monty.Ecommerce.User.Entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface UserService {

    List<User> getAllUser();
    List<User>  getUserByName(String loginUsername);
    User createUser(User user);
    User findUser(UUID userId);

    ResponseEntity<User> getUserId(UUID userId);
    ResponseEntity<User> updateUser(UUID userId,User user);
    ResponseEntity<Map<String , Boolean>> deleteUser(UUID userId);
    ResponseEntity<Map<String , Boolean>> deleteAllUser();



}
