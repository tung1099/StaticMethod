package com.company;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Tung");
        Student s2 = new Student(222, "Chi");
        Student s3 = new Student(333, "Phi");

        s1.display();
        s2.display();
        s3.display();
    }
}
