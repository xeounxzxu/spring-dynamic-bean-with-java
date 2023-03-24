package com.example.dynamicbeans.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SocialUserService implements UserCreatedService {

    @Override
    public void created() {
        log.info("Social User Service");
    }
}
