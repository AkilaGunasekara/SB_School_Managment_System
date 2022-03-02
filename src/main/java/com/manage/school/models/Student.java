package com.manage.school.models;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String Name;
    private int Age;
    private String Grade;
    private String Clz;
    private String Address;
    private String TP;
    private String email;

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }



    @OneToOne
    @JoinColumn(name = "parent_id",referencedColumnName = "ID")
    private Parents parents;

    public Set<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subjects> subjects) {
        this.subjects = subjects;
    }

    @ManyToMany
    @JoinTable(
            name = "Student_Subject",
            joinColumns = @JoinColumn(name = "Student_ID"),
            inverseJoinColumns = @JoinColumn(name = "Subject_ID")
    )

    private Set<Subjects> subjects = new HashSet<>();

    public Student() {
    }

    public Student(String Name, int Age,String Grade,String Clz,String Address,String TP,String email,Parents parents) {
        this.Name = Name;
        this.Age = Age;
        this.Grade= Grade;
        this.Clz =Clz;
        this.Address =Address;
        this.TP =TP;
        this.email= email;
        this.parents = parents;


    }


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getClz() {
        return Clz;
    }

    public void setClz(String clz) {
        Clz = clz;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTP() {
        return TP;
    }

    public void setTP(String TP) {
        this.TP = TP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
