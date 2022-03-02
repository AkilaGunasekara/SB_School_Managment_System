package com.manage.school.services;

import com.manage.school.models.Student;
import com.manage.school.models.Teachers;
import com.manage.school.repository.TeachersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeachersSer {
    @Autowired
    private TeachersRepo teacherRepo;
    public Teachers addTeacher(Teachers teachers){
        return teacherRepo.save(teachers);
    }

    public List<Teachers> getTeachers(){

        return teacherRepo.findAll();
    }

    public Teachers getteaByID(long ID) {

        Optional<Teachers> model=teacherRepo.findById(ID);

        if (model.isPresent())
        {
            return model.get();
        }
        return null;
    }

}
