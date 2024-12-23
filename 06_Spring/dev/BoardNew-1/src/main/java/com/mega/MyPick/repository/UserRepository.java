package com.mega.MyPick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mega.MyPick.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
