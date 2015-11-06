package com.grinyov.spring.intro.hwargs;

/**
 * Created by green on 21.10.2015.
 */
public class HelloWorldWithCommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello World!");
        }
    }
}
