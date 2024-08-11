package com.kodnest.library.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.library.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>  {

}




