package com.kodnest.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.library.entity.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {

}
