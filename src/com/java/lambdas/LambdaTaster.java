package com.java.lambdas;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaTaster {

    public static void main(String[] args) {

        //Supplier
        Supplier<String> supplier = () -> {
            System.out.println("I am inside the supplier");
            return "hello"; //you only need the explicit return if you have >1 line of code
        };

        String string = supplier.get();
        System.out.println("string = " + string);

        //Consumer
        Consumer<String> consumer = (String s) -> {
            System.out.println("I am inside of the consumer");
            System.out.println(s);
        };//curly not needed if only printing one line
        consumer.accept("Hello");
    }
}

