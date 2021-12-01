package com.example.AuthService.Interfaces;

import com.example.AuthService.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
