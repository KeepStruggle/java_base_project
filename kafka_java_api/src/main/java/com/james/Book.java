package com.james;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Book {
    public Book(){}
    private String id;

    /**
     * 加上@SerializedName注解后服务端api返回name、bookName、Name、bn时，客户端都能够拿到正确的值给name属性。
     */
    @SerializedName(value = "bookName",alternate = {"Name","bn"})
    private String name;

    private List<Book> bookList;

    private String[] args;

    public Book(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }
}
