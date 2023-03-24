package com.example.dynamicbeans.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SocialUserService implements UserCreatedService {

    @Override
    public String created() {
        return "Social User Service";
    }
}
