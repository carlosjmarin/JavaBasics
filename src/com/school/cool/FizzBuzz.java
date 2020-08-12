package com.school.cool;

public class FizzBuzz {
    public static void main(String[] args) {
//        byte j;
//        for (j = 1; j <= 100; j++)
//        {
//            if (j % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (j % 3 == 0)
//            {
//                System.out.println("Fizz");
//            } else if (j % 5 == 0)
//            {
//                System.out.println("Buzz");
//            }
//        }
        //this only does two checks instead of 3
        for(byte i = 1; i <= 100; i++){
            String s = "";
            if(i%3 == 0){
                s += "Fizz";
            }
            if(i % 5 == 0){
                s+= "Buzz";
            }
            //ternary operator is the ?, which means that the colon to the right will return the things on the left if
            //true or the things on the right if false. basically if s is != to "" then print s or else print i
            System.out.println(s != "" ? s : i);
        }
    }
}
