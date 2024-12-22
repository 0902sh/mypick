package com.mega.MyPick.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mega.MyPick.entity.User;
import com.mega.MyPick.service.LoginService;
import com.mega.MyPick.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private final LoginService loginService;

    public UserController(UserService userService, LoginService loginService) {
        this.userService = userService;
        this.loginService = loginService;
    }

    // 회원가입 엔드포인트
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userService.createUser(user);
        return ResponseEntity.ok(savedUser);
    }

    // 로그인 엔드포인트
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        String token = loginService.loginUser(user.getEmail(), user.getPassword());
        return ResponseEntity.ok(token);
    }
}
