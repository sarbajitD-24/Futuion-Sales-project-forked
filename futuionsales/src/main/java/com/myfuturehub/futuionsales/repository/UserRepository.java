package com.myfuturehub.futuionsales.repository;

import com.myfuturehub.futuionsales.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
     public Optional<User> findByUserName(String userName);

    public User findByEmail(String email);
}
