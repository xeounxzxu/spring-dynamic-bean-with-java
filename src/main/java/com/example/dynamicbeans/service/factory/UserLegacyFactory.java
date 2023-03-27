package com.example.dynamicbeans.service.factory;

import com.example.dynamicbeans.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserLegacyFactory {

    private final UserService defaultUserService;

    private final UserService socialUserService;

    public String created(UserService.Name beanName) {
        return UserService.Name.SOCIAL.equals(beanName) ? socialUserService.created() : defaultUserService.created();
    }
}
