package org.fatfrogdev.redisdemo.repository;


import org.fatfrogdev.redisdemo.domain.model.Book;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class BookRepository {

    private final RedisTemplate redisTemplate;

    private final static String KEY = "BOOK";

    public BookRepository(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public boolean save(Book book) {
        try {
            redisTemplate.opsForHash().put(KEY, book.getId(), book);
            return true;
        } catch (Exception e) {
            System.out.print(e.getMessage());
            return false;
        }
    }

    public List<Book> findAll(){
        return  redisTemplate.opsForHash().values(KEY);
    }
}
