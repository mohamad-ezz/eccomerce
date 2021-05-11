package com.Monty.Ecommerce.User.Repository;

import com.Monty.Ecommerce.User.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.io.Serializable;
import java.util.List;
import java.util.UUID;


public interface UserRepository extends JpaRepository<User, Serializable> {

    @Query
    User findById(UUID userId);

    @Query
    List<User> FindByUserName(String loginUsername);




}
