package com.school.cool;
//below is our abstract class with an abstract method for future objects to pull from
abstract class Car {
    //we wont be able to instantiate the class but we can use it to abstract our implementation
    abstract void drive();
}
//we must EXTEND the abstract class and provide implementation
class Lambo extends Car {
    //implementation for abs. method 'drive'
    void drive() {
        System.out.println("go Go GO!");
    }
}
class Tesla extends Car{
        void drive(){
            System.out.println("E-cars for da win!");
        }
}
class TestAbs1 {
    //now to run it
    public static void main(String[] args) {
        //now we can instantiate the lambo class and call the method
        Car v2 = new Lambo();
        v2.drive();
        //instead of having class testabs1, we could make class tesla static
        //and contain tesla and psvm in the class lambo braces
        Car ecar = new Tesla();
        ecar.drive();
    }
}