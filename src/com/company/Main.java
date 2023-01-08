package com.company;

public class Main {

    public static void main(String[] args) {
	// Still need to update this with the various different options a user can input and the appropriate method calls

        String id = "23";
        String name = "Bob";
        String address = "123 Main Street";

        Student person1 = new Student(id, name, address);

        String outAddress = person1.getAddress();

        String id2 = "24";
        String name2 = "Bill";
        String address2 = "124 Main Street";

        Student person2 = new Student(id, name, address);

        String nameOutput = person2.getStudentName();

        School testing = new School();

        testing.addStudent(person1);
        testing.addStudent(person2);

    }
}
