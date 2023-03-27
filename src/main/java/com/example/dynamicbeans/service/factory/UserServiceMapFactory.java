package com.example.dynamicbeans.service.factory;

import com.example.dynamicbeans.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserServiceMapFactory {

    private final Map<String, UserService> stringUserCreatedServiceMap;

    public String created(UserService.Name name) {
        return stringUserCreatedServiceMap.get(name.getValue()).created();
    }
}
