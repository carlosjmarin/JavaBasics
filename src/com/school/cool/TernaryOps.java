package com.school.cool;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TernaryOps {
    public static void main(String[] args) {

        byte a = 0;
        String check = (a % 2 == 0) ? "a is even!" : "a is odd!";
        System.out.println(check);

    }
}