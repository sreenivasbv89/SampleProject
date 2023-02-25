package com.aspirants.h2demo.controller;

import com.aspirants.h2demo.entity.onetoone.Books;
import com.aspirants.h2demo.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BooksService booksService;

    @PostMapping("/addBook")
    public Books addEmployee(@RequestBody Books book){
       return booksService.saveBook(book);
    }

    @PutMapping("/updateBook")
    public Books updateBook(@RequestBody Books book){
        return booksService.updateBook(book);
    }
    @GetMapping("/findByIdGiven/{id}")
    public Books findByIdGiven(@PathVariable int id){
        return booksService.findByIdGiven(id);
    }
}
