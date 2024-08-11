package com.kodnest.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.library.entity.Library;
import com.kodnest.library.repository.LibraryRepository;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;

    public List<Library> getAllLibraryRecords() {
        return libraryRepository.findAll();
    }

    public Library saveLibraryRecord(Library library) {
        return libraryRepository.save(library);
    }
}
