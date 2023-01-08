package com.company;

import java.util.List;

public class Student {

    private String name;
    private String address;
    private Integer id;
    private Long homePhone;
    private Long mobilePhone;
    private List<Mark> marks;
    private Double average;

    public String getStudentName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(Long homePhone) {
        this.homePhone = homePhone;
    }

    public Long getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Long mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }


    // This is a method that can be used to find whether a specific student has a grade above or below a specified value
    public Boolean markChecker(int mark, Boolean above) {

        boolean found = false;

        // Go over the array of marks for a student
        for (Mark value : this.marks) {

            // This is if we want to check for marks greater than a specific grade
            if (above) {
                // Note that we use >= here
                if (value.getMark() >= mark) {
                    // As soon as we find one mark that meets the condition then we set found to true and stop the loop
                    found = true;
                    break;
                }
            }
            // This is where we go if we are checking for marks below a specific grade
            else {
                // Note that we use <= here
                if (value.getMark() <= mark) {
                    // As soon as we find one mark that meets the condition then we set found to true and stop the loop
                    found = true;
                    break;
                }
            }
        }
        return found;
    }

    // Need another function here that creates a list of marks for the individual student.
    // Method should also calculate the average after we have all the marks, by using the calculateAverage() method below
    // Can then call the 'createMarkList' method within the Student constructor below

    public void calculateAverage() {

        double average = 0.0;
        int sum = 0;

        // Goes over the list of marks for the student and sums them up
        for(Mark value : this.marks) {
            sum+=value.getMark();
        }

        // Divide the sum of all the marks by the number of marks there are
        double denominator = this.marks.size();
        average = sum/denominator;

        // Assign the result to the private average value for this student object
        this.average = average;
    }

    public Student(String studentId, String studentName, String address) {

        //Create marks array
        //Mark[] testing = Mark.marksArray();

        setAddress(address);
        setName(name);
        setId(id);
        //setMarks(testing);

    }

    // Returns the full list of details for a student in a String
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", homePhone=" + homePhone +
                ", mobilePhone=" + mobilePhone +
                ", marks=" + marks +
                ", average=" + average +
                '}';
    }
}
