package com.example.dynamicbeans.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceFactory {
    private final BeanFactory beanFactory;

    public void created(UserCreatedService.Name name) {
        UserCreatedService service = beanFactory.getBean(name.getValue(), UserCreatedService.class);
        service.created();
    }

}