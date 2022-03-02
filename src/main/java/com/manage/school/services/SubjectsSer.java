package com.manage.school.services;

import com.manage.school.models.Subjects;
import com.manage.school.repository.SubjectsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;
import java.util.List;

@Service
public class SubjectsSer {
    @Autowired
    private SubjectsRepo subjectsRepo;
    public Subjects addSubjects(Subjects subjects) {return subjectsRepo.save(subjects);
    }

    public List<Subjects> getAllSubjects(){
        return subjectsRepo.findAll();
    }


}
