package com.manage.school.services;
import com.manage.school.models.Parents;
import com.manage.school.repository.ParentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentsSer {

    @Autowired
    private ParentsRepo parentsRepo;


    public Parents addParents(Parents parents){
        return parentsRepo.save(parents);
    }

}
