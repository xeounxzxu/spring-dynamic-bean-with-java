package com.example.dynamicbeans.service.factory;

import com.example.dynamicbeans.service.UserCreatedService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("UserServiceMapFactory 에서")
class UserServiceMapFactoryTest {

    @Autowired
    private UserServiceMapFactory userServiceMapFactory;

    @Nested
    @DisplayName("Created Method 는")
    public class CreatedMethod {

        @Test
        @DisplayName("UserServiceFactory 에서 Name 값을 Social 를 넘겨주면 성공적이다.")
        void createdSocial() {

            String value = userServiceMapFactory.created(UserCreatedService.Name.SOCIAL);

            assertEquals("Social User Service", value);
        }


        @Test
        @DisplayName("UserServiceFactory 에서 Name 값을 Default 를 넘겨주면 성공적이다.")
        public void createdDefault() {

            String value = userServiceMapFactory.created(UserCreatedService.Name.DEFAULT);

            assertEquals("Default User Service", value);
        }
    }
}
