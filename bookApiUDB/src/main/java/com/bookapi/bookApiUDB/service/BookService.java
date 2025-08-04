package com.bookapi.bookApiUDB.service;

import com.bookapi.bookApiUDB.model.Book;
import com.bookapi.bookApiUDB.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
