package com.example.dynamicbeans.controller;

import com.example.dynamicbeans.service.UserCreatedService;
import com.example.dynamicbeans.service.UserServiceFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserCreatedController {

    private final UserServiceFactory userServiceFactory;

    @GetMapping
    public void created(@RequestParam(name = "num") Integer num) {
        UserCreatedService.Name name = num == 1 ? UserCreatedService.Name.DEFAULT : UserCreatedService.Name.SOCIAL;
        userServiceFactory.created(name);
    }
}
