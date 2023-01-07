package com.company;

public class Student {

    private String name;
    private String address;
    private Integer id;
    private Long homePhone;
    private Long mobilePhone;
    private Mark[] marks;
    private Float average;

    public Float getAverage() {
        return average;
    }

    public void setAverage(Float average) {
        this.average = average;
    }

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

    public Mark[] getMarks() {
        return marks;
    }

    public void setMarks(Mark[] marks) {
        this.marks = marks;
    }

    // Need something here that creates a list of marks for the individual student.
    // Can then call that method within the Student constructor below

    // Once we have list of marks then we can go over the list and get an average of all marks
    // When we have that average, we just set this students average variable to that value

    public Student(String studentId, String studentName, String address) {

        //Create marks array
        //Mark[] testing = Mark.marksArray();

        setAddress(address);
        setName(name);
        setId(id);
        //setMarks(testing);

    }
}
