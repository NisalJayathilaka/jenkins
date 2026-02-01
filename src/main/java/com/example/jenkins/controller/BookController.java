package com.example.jenkins.controller;

import com.example.jenkins.entity.Book;
import com.example.jenkins.service.BookService;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/book")
@RestController
public class BookController {


    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/all")
    public List<Book> getAllBooks(){
        List<Book> bookList = bookService.getAllBooks();
        String a  = "nisalasass";
        String str = null;
        System.out.println(str.length());
        return bookList;
    }
}
