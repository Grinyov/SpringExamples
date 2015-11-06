package com.grinyov.spring.intro.hwext;

/**
 * Created by green on 21.10.2015.
 */
public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage() {
        return "Hello World!";
    }
}
