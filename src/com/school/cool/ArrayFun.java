package com.school.cool;

public class ArrayFun {
    public static void main(String[] args) {
        String[] str = {"fun", "love"};
        //will get an out of bounds exception if you want to print something out of the array
        int[] cars = {1,2,3};
        System.out.println(cars[1]);
        System.out.println(str.length);
        str[1].replace("love", "python");
        System.out.println(str[1]);
    }
}
