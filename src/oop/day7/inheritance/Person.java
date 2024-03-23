package oop.day7.inheritance;

import java.util.Date;

public class Person {
    private String name;
    private String id;
    private String address;
    private String mobile;
    private Date birthDate;

    public Person() {
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Person(String name, String id, String mobile) {
        this.name = name;
        this.id = id;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
