package com.company;

import static java.sql.DriverManager.println;

public class Mark {

    private String subject;
    private Float mark;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Float getMark() {
        return mark;
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }

    /*public static Mark[] marksArray() {
        // Create array of marks
        return new Mark[];
    }*/

    public Boolean markChecker(Float mark) {
        return (mark >= 0 && mark <=100);
    }

    public Mark(String subject, Float mark) {

        if (!markChecker(mark)) {
            println("INVALID MARK ENTERED!!!!! TRY AGAIN.");
            return;
        }

        setMark(mark);
        setSubject(subject);
    }
}
