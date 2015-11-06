package com.grinyov.spring.intro.hwfactory;

import com.grinyov.spring.intro.hwext.MessageProvider;
import com.grinyov.spring.intro.hwext.MessageRenderer;

/**
 * Created by green on 21.10.2015.
 */
public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
