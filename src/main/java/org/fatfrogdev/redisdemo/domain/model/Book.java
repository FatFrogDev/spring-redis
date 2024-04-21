package org.fatfrogdev.redisdemo.domain.model;

import java.io.Serializable;

public class Book implements Serializable {

    private String id;

    private String title;

    private String author;


    public Book() {

    }

    public Book(String author, String id, String title) {
        this.author = author;
        this.id = id;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}