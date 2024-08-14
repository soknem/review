package com.example.review.test;

interface Person {

    String getStudentName();
}

abstract class Person1 {

    private String name;

    String getStudentName1(){
        return "";
    };

    abstract String getStudentName2();
}


class Student extends Person1{


    @Override
    String getStudentName2() {
        return null;
    }

    Person1 student =new Student1() ;

    Person1 student1 = new Student1();

    Integer a = 10;

}

class Student1 extends Person1{

    @Override
    String getStudentName2() {
        return null;
    }
}
