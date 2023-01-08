package com.company;

import java.util.ArrayList;
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

   /* This is probably not needed but could be something else to search by
   public Student findStudentByName(String studentName) {

        // Go over the list of students
        // For each one check if student.getName() is equal to the studentName passed into this method
        // If it is not equal keep going
        // If it is equal stop, and return that specific student
    }
    */

    public List<Student> findStudentsByGrade(int mark, Boolean above) {

        // This is to store people that we find who meet the criteria
        List<Student> foundStudents = new ArrayList<Student>();

        // Go over the list of students
        for (Student student : this.school) {

            // For each one go over list of student's marks, check if any mark is over the mark value passed into this method
            // .markChecker() is a method which will check if a mark is above/below a specific value
            boolean validStudent = student.markChecker(mark, above);

            // If it is then add THAT student to the list
            if (validStudent) {
                foundStudents.add(student);
            }
        }
        // Return the list of students
        return foundStudents;
    }

    // Returns a full list of students in the school as a String
    // Might not work entirely as expected, might print out a reference to the student object and not the actual student info
    @Override
    public String toString() {
        return "School{" +
                "school=" + school +
                '}';
    }
}
