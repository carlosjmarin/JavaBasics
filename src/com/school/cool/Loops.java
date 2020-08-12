package com.school.cool;

public class Loops {
    public static void main(String[] args) {

        //for loop
        for(int i = 1 ; i <= 100; i++)
        {
            System.out.println(i);
        }

        String[] lang = {"Java", "Angular", "Typescript"};
        //enhanced for loop, since java 5, we got enhanced for loops
        for(String l:lang)
        {
            System.out.println(l);
        }
        //while loop
        byte whilVar = 0;
        while(whilVar<100)
        {
            System.out.println(whilVar);
            whilVar++;
        }
        //do while for when you always want to execute once
        do {
            System.out.println(whilVar);
            whilVar++;
        }while(whilVar<100);
    }
}
