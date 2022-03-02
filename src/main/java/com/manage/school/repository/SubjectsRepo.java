package com.manage.school.repository;
import com.manage.school.models.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubjectsRepo extends JpaRepository<Subjects,Long> {
}
