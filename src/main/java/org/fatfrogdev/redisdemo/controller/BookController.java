package org.fatfrogdev.redisdemo.controller;


import org.fatfrogdev.redisdemo.domain.model.Book;
import org.fatfrogdev.redisdemo.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/")
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        boolean result = bookService.save(book);
        bookService.save(book);
        if(result)
            return ResponseEntity.ok("Book added successfully");
        else
            return ResponseEntity.badRequest().body("Failed to add book");
    }


    @GetMapping("/all")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> books = bookService.findAll();

        if (!books.isEmpty())
            return ResponseEntity.ok(books);
        else
            return ResponseEntity.notFound().build();
    }


//    @PostMapping("/{id}")
//    public ResponseEntity<Book> addBook(@PathVariable String id) {
//        boolean result = bookService.save(book);
//        if(result)
//            return ResponseEntity.ok("Book added successfully");
//        else
//            return ResponseEntity.badRequest().body("Failed to add book");
//    }
}
