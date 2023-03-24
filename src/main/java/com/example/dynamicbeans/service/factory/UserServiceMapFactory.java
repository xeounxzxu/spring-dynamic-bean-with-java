package com.example.dynamicbeans.service.factory;

import com.example.dynamicbeans.service.UserCreatedService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceMapFactory {

    private final Map<String, UserCreatedService> stringUserCreatedServiceMap;

    public UserServiceMapFactory(Map<String, UserCreatedService> stringUserCreatedServiceMap) {
        this.stringUserCreatedServiceMap = stringUserCreatedServiceMap;
    }

    public String created(UserCreatedService.Name name) {
        return stringUserCreatedServiceMap.get(name.getValue()).created();
    }
}
