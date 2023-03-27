package com.example.dynamicbeans.service.factory;

import com.example.dynamicbeans.service.DefaultUserService;
import com.example.dynamicbeans.service.SocialUserService;
import com.example.dynamicbeans.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@DisplayName("UserServiceFactory 에서")
class UserServiceFactoryTest {

    @Autowired
    private BeanFactory beanFactory;

    @Autowired
    private UserServiceFactory userServiceFactory;

    @Nested
    @DisplayName("created method 는")
    public class CreatedMethod {

        @Test
        @DisplayName("Bean Factory 를 통해서 Name 의 값으로 호출 시 성공적이다. with SocialUserService")
        public void checkedSocialUserService() {

            UserService userService = (UserService) beanFactory.getBean(UserService.Name.SOCIAL.getValue());

            assertTrue(userService instanceof SocialUserService);
        }

        @Test
        @DisplayName("Bean Factory 를 통해서 Name 의 값으로 호출 시 성공적이다. with DefaultUserService")
        public void checkedDefaultUserService() {

            UserService userService = (UserService) beanFactory.getBean(UserService.Name.DEFAULT.getValue());

            assertTrue(userService instanceof DefaultUserService);
        }

        @Test
        @DisplayName("UserServiceFactory 에서 Name 값을 Social 를 넘겨주면 성공적이다.")
        public void createdSocial() {

            String value = userServiceFactory.created(UserService.Name.SOCIAL);

            assertEquals("Social User Service", value);
        }

        @Test
        @DisplayName("UserServiceFactory 에서 Name 값을 Default 를 넘겨주면 성공적이다.")
        public void createdDefault() {

            String value = userServiceFactory.created(UserService.Name.DEFAULT);

            assertEquals("Default User Service", value);
        }
    }
}
