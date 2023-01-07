package com.company;

import java.util.List;

public class School {

    private List<Student> school;

    public List<Student> getSchool() {
        return school;
    }

    public void setSchool(List<Student> school) {
        this.school = school;
    }

    public List<Student> addStudent(Student person) {
        this.school.add(person);

        return this.school;
    }

    public Student findStudentByName(String studentName) {

        // Go over the list of students
        // For each one check if student.getName() is equal to the studentName passed into this method
        // If it is not equal keep going
        // If it is equal stop, and return that specific student
    }

    public List<Student> findStudentsByGrade(Float mark) {

        // Go over the list of students
        // For each one go over list of student's marks, check if any mark is over the mark value passed into this method
        // If it is then add THAT student to the list
        // If it is not then move on to next student
        // Return the list of students
    }
}
