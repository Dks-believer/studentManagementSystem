package com.pCommons.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pCommons.model.*;

@Repository
public interface CourseRepo extends JpaRepository<Courses, Integer> {

}
