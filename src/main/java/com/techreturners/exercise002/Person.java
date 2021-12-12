package com.techreturners.exercise002;

public class Person {
    private String firstname;
    private String lastname;
    private String City;



    private int Age;

    public Person(String firstname,String lastname,String City,int Age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.City = City;
        //this.Age = Integer.parseInt(Age);
        this.Age = Age;
    }
    public String getFirstname() {return firstname;}
    public String getLastname() {return lastname;}
    public String getCity() {return City;}
    public int getAge() {
        return Age;
    }


}
