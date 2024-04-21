package org.fatfrogdev.redisdemo.service;


import org.fatfrogdev.redisdemo.domain.model.Book;

import java.util.List;


public interface BookService {
    boolean save(Book book);

    List<Book> findAll();


}
