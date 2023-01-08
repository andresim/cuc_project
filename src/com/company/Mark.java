package com.company;

import static java.sql.DriverManager.println;

public class Mark {

    private String subject;
    private int mark;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    /*public static Mark[] marksArray() {
        // Create array of marks
        return new Mark[];
    }*/

    public Boolean markChecker(int mark) {
        return (mark >= 0 && mark <=100);
    }

    public Mark(String subject, int mark) {

        // Checks if a mark is within the right bounds (between 0 and 100)
        // If it is not then it prints an error and does not create the mark
        if (!markChecker(mark)) {
            println("INVALID MARK ENTERED! TRY AGAIN.");
            return;
        }

        setMark(mark);
        setSubject(subject);
    }
}
