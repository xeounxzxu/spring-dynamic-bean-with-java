package com.example.dynamicbeans.service.factory;


import com.example.dynamicbeans.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceFactory {
    private final BeanFactory beanFactory;

    public String created(UserService.Name name) {
        UserService service = beanFactory.getBean(name.getValue(), UserService.class);
        return service.created();
    }

}
