package com.example.dynamicbeans.service.factory;


import com.example.dynamicbeans.service.UserCreatedService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceFactory {
    private final BeanFactory beanFactory;

    public String created(UserCreatedService.Name name) {
        UserCreatedService service = beanFactory.getBean(name.getValue(), UserCreatedService.class);
        return service.created();
    }

}