package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Student_Management")
public class Student {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String branch;
    private String year;
    private String course;
    private String contact_no;
    private String email;

    public Student(long id, String name, String father_name, String branch, String year, String course, String contact_no, String email) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.year = year;
        this.course = course;
        this.contact_no = contact_no;
        this.email = email;
    }

    public Student() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
