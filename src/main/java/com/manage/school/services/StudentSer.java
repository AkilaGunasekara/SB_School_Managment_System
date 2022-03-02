package com.manage.school.services;
import java.util.List;
import java.util.Optional;

import com.manage.school.models.Student;
import com.manage.school.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentSer {
    
    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent(Student student){
        return studentRepo.save(student);
    }

    public List<Student> getStudent(){
        return studentRepo.findAll();
    }

    public Student getStdByID(long ID){

        Optional<Student> model=studentRepo.findById(ID);

        if (model.isPresent())
        {
            return model.get();
        }
        return null;
    }
    public void deleteByStudentId(Long ID) { studentRepo.deleteById(ID); }



}
