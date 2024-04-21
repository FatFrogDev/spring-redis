package org.fatfrogdev.redisdemo.service.impl;

import org.fatfrogdev.redisdemo.domain.model.Book;
import org.fatfrogdev.redisdemo.repository.BookRepository;
import org.fatfrogdev.redisdemo.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public boolean save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

}
