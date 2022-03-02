package com.manage.school.controaler;

import com.manage.school.models.Student;
import com.manage.school.models.Subjects;;
import com.manage.school.services.StudentSer;
import com.manage.school.services.SubjectsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SubjectsCon {
    @Autowired
    private SubjectsSer subjectsSer;
    @Autowired
    private StudentSer studentSer;



    @PostMapping("addSubject")
    public String addVTypes(@ModelAttribute Subjects subjects, Model model){
//        System.out.println("type added");
        subjectsSer.addSubjects(subjects);

        model.addAttribute("newSubjects", new Subjects());
        return "SubjectAdd";
    }

    @GetMapping("Subjects")
    public String Teacher(Model model){


        model.addAttribute("newSubjects", new Subjects());

        return "SubjectAdd";


    }
    @GetMapping("AssignSub")
    public String AssignSub(Model model) {


        model.addAttribute("Studentpre", new Student());
        model.addAttribute("AllStudents", studentSer.getStudent());
        model.addAttribute("AllSubjects", subjectsSer.getAllSubjects());

        return "AssignSub";
    }

}
