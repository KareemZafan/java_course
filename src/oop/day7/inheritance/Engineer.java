package oop.day7.inheritance;

import javax.lang.model.element.NestingKind;

public class Engineer extends Person{
    private String facultyName;
    private int graduationYear;
    private String grade;


    public Engineer() {
        super();
    }

    public Engineer(String name, String id, String mobile, String facultyName, int graduationYear, String grade) {
        super(name,id,mobile);
        this.facultyName = facultyName;
        this.graduationYear = graduationYear;
        this.grade = grade;
    }

    public Engineer(String name, String id, String facultyName, String grade) {
        super(name, id);
        this.facultyName = facultyName;
        this.grade = grade;
    }
}
