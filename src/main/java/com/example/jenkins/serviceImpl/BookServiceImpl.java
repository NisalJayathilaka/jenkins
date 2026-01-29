package com.example.jenkins.serviceImpl;

import com.example.jenkins.entity.Book;
import com.example.jenkins.repository.BookRepository;
import com.example.jenkins.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> bookList = bookRepository.findAll();
        return bookList;
    }
}
