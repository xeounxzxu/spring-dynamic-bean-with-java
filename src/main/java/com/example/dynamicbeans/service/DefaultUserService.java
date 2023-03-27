package com.example.dynamicbeans.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DefaultUserService implements UserService {

    @Override
    public String created() {
        return "Default User Service";
    }
}
