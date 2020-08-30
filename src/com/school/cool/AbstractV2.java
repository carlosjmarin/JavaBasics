package com.school.cool;

abstract class Hoverboard {
    Hoverboard(){
        System.out.println("Hoverboard operational");
    }
    //this will run second but is implemented later
    abstract void run();
    void thrustersEngaged(){
        System.out.println("Thrusty-3000 activated");
    }
}
//now for the child class to inherit abs class
class Hovy1 extends Hoverboard{
    void run(){
        System.out.println("Working normally...Max Thrust in 3..2..1");
    }
}
//now to test which will call abs and non abs methods
class TestAbs2{
    public static void main(String[] args) {
        Hoverboard v1 = new Hovy1();
        v1.run();
        v1.thrustersEngaged();
    }
}