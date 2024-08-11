package com.kodnest.library.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kodnest.library.entity.Book;
import com.kodnest.library.entity.Library;
import com.kodnest.library.entity.Student;
import com.kodnest.service.BookService;
import com.kodnest.service.LibraryService;
import com.kodnest.service.StudentService;

import java.time.LocalDate;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/library")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;
    
    @Autowired
    private StudentService studentService;
    
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Library> getAllLibraryRecords() {
        return libraryService.getAllLibraryRecords();
    }

    @PostMapping
    public Library saveLibraryRecord(@RequestParam Long studentId, @RequestParam Long bookId, @RequestParam String startDate, @RequestParam String endDate) {
        Student student = studentService.getStudentById(studentId);
        Book book = bookService.getBookById(bookId);
       
        Library library = new Library();
        library.setStudent(student);
        library.setBook(book);
        library.setStartDate(LocalDate.parse(startDate));
        library.setEndDate(LocalDate.parse(endDate));
       
        return libraryService.saveLibraryRecord(library);
    }
}
