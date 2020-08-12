package com.school.cool;

public class Person {

        String firstName;
        String lastName;
        String id;

        public static int MAX_AGE = 200;

        Person()
        {
            System.out.println("Constructor is called");
        }

        Person(String firstName, String lastName, String id)
        {
            this();
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }
}
