package com.example.dynamicbeans.service.factory;

import com.example.dynamicbeans.service.UserCreatedService;
import org.apache.commons.text.CaseUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class UserServiceMapFactory {

    private final Map<String, UserCreatedService> stringUserCreatedServiceMap;

    public UserServiceMapFactory(List<UserCreatedService> services) {
        this.stringUserCreatedServiceMap = services.stream()
                .collect(Collectors.toMap((c) ->
                                //todo : fix it
                                c.getClass().getSimpleName().su
                        , Function.identity()));
    }

    public String created(UserCreatedService.Name name) {
        return stringUserCreatedServiceMap.get(name).created();
    }
}
