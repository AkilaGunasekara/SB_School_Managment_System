package com.manage.school.models;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String SubName;
    private String Chapters;

    @OneToMany(mappedBy = "subjects")
    private Set<Teachers>teachers = new HashSet<>();



    public String getChapters() {
        return Chapters;
    }

    public void setChapters(String chapters) {
        Chapters = chapters;
    }



    public Subjects(String subName) {
        SubName = subName;
    }

    public Subjects() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getSubName() {
        return SubName;
    }

    public void setSubName(String subName) {
        SubName = subName;
    }


}
