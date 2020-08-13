package com.school.cool;
//here we will demonstrate the use of a constructor
public class Cars {
    String car;
    Cars()
    {
        this.car = "lambo, waddup";
    }

    public static void main(String[] args) {
        Cars transport = new Cars();
        System.out.println(transport.car);
    }
}
