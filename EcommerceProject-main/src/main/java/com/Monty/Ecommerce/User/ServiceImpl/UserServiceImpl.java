package com.Monty.Ecommerce.User.ServiceImpl;

import com.Monty.Ecommerce.User.Entity.User;
import com.Monty.Ecommerce.User.Repository.UserRepository;
import com.Monty.Ecommerce.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getUserByName(String loginUsername) {
        return userRepository.FindByUserName(loginUsername);
    }

    @Override
    public User createUser(User user) {
        Calendar dateCreated = Calendar.getInstance();
        user.setDateCreated(dateCreated);
        return userRepository.save(user);

    }

    @Override
    public User findUser(UUID userId) {
        User user = userRepository.findById(userId);
        return user;
    }

    @Override
    public ResponseEntity<User> getUserId(UUID userId) {
        User user = userRepository.findById(userId);
        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<User> updateUser(UUID userId, User user) {  User usr= userRepository.findById(userId);
        usr.setLoginUsername(user.getLoginUsername());
        usr.setActive(user.isActive());
        Calendar dateUpdated = Calendar.getInstance();
       usr.setDateUpdated(dateUpdated);
        usr.setEmail(user.getEmail());
      usr.setCustomer(user.isCustomer());
       usr.setSuperAdmin(user.isSuperAdmin());
      usr.setVendor(user.isVendor());
      usr.setLoginPassword(user.getLoginPassword());




       User updateUser = userRepository.save(usr);
       return ResponseEntity.ok(updateUser);

    }

    @Override
    public ResponseEntity<Map<String, Boolean>> deleteUser(UUID userId) {
        User user = userRepository.findById(userId);
        userRepository.delete(user);
        Map<String, Boolean> response = new HashMap();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> deleteAllUser() {
        userRepository.deleteAll();
        Map<String, Boolean> response = new HashMap();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }


}
