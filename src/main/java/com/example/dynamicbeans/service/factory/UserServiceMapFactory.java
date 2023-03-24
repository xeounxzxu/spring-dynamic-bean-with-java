package com.example.dynamicbeans.service.factory;

import com.example.dynamicbeans.service.UserCreatedService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserServiceMapFactory {

    private final Map<String, UserCreatedService> stringUserCreatedServiceMap;

    public String created(UserCreatedService.Name name) {
        return stringUserCreatedServiceMap.get(name.getValue()).created();
    }
}
