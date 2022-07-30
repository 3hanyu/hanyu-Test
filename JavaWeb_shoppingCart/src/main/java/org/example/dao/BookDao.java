package org.example.dao;

import org.example.domain.Book;

import java.util.Map;

public class BookDao {
    //获取存放着书籍的Map集合
    public Map<String, Book> getAll() {
        return BookDB.getAll();
    }

    //根据关键字获取某本书籍
    public Book find(String id) {
        return BookDB.getAll().get(id);
    }
}
