package com.grinyov.spring.intro.hwext;

/**
 * Created by green on 21.10.2015.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
