package com.aspirants.h2demo.service;

import com.aspirants.h2demo.dao.BookRepository;
import com.aspirants.h2demo.entity.onetoone.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {

    @Autowired
    private BookRepository bookRepository;

    public List<Books> getAllBooks(){
      return bookRepository.findAll();
    }

    public Books saveBook(Books book){
        final Books savedBook = bookRepository.save(book);
        return savedBook;
    }

    public Books updateBook(Books books) {
        Optional<Books> bookById = bookRepository.findById(books.getId());
        final Books books1 = bookById.get();
        books1.setPrice(books.getPrice());
        return bookRepository.save(books1);
    }

    public Books findByIdGiven(int id) {
        final Optional<Books> byId = bookRepository.findByBookId(id);
        final Books book = byId.get();
        return book;

    }
}
