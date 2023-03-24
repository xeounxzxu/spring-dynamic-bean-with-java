package com.example.dynamicbeans.controller;

import com.example.dynamicbeans.service.UserCreatedService;
import com.example.dynamicbeans.service.factory.UserServiceFactory;
import com.example.dynamicbeans.service.factory.UserServiceMapFactory;
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

    private final UserServiceMapFactory userServiceMapFactory;

    @GetMapping("beanfactory")
    public String created(@RequestParam(name = "num") Integer num) {
        UserCreatedService.Name name = num == 1 ? UserCreatedService.Name.DEFAULT : UserCreatedService.Name.SOCIAL;
        return userServiceFactory.created(name);
    }

    @GetMapping("map")
    public String created2(@RequestParam(name = "num") Integer num) {
        UserCreatedService.Name name = num == 1 ? UserCreatedService.Name.DEFAULT : UserCreatedService.Name.SOCIAL;
        return userServiceMapFactory.created(name);
    }

}
