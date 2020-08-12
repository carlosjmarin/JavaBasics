package com.school.cool;

public class UsePerson {
    public static void main(String[] args) {
        //first obj
        Person person1 = new Person();
        person1.firstName = "Los";
        person1.lastName = "mar";
        person1.id = "1";

        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.id);
        //creating second obj
        Person person2 = new Person();
        person1.firstName = "Gandalf";
        person1.lastName = "Grey";
        person1.id = "2";

        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.id);
        //creating another guy
        Person guy = new Person("my","man","7");
        System.out.println(guy.firstName);
        System.out.println(guy.lastName);
        System.out.println(guy.id);
        //using a getter and setter
        Person person3 = new Person();
        person3.setFirstName("bilbo");
        System.out.println(person3.getFirstName());
        //static reference to the variable
        System.out.println(Person.MAX_AGE);
    }
}
