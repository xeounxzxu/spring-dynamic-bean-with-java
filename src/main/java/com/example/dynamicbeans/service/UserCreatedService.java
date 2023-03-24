package com.example.dynamicbeans.service;

public interface UserCreatedService {

    /**
     * 공통 처리 Method
     */
    void created();

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
