package com.school.cool.pack1;

import com.school.cool.pack2.InvokeMe;

public class PSA {
    public static void main(String[] args) {
        //you can access from other package only if its imported
        //private is only within that class
        InvokeMe nums = new InvokeMe();
        nums.a = 1;
        nums.b = 2;
        System.out.println(nums.a);
        System.out.println(nums.b);

    }
}
