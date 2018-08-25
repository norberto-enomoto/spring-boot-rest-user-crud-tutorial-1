package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.model.User;

/**
 * Created by Santosh on 15/08/18.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
