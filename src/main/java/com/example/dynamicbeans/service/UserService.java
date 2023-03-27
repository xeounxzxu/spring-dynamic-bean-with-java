package com.example.dynamicbeans.service;

public interface UserService {

    /**
     * 공통 처리 Method
     */
    String created();

    enum Name {
        SOCIAL("socialUserService"),
        DEFAULT("defaultUserService");
        private final String value;

        Name(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
