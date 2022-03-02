package com.manage.school.repository;
import com.manage.school.models.Parents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentsRepo extends JpaRepository<Parents,Long> {
}
