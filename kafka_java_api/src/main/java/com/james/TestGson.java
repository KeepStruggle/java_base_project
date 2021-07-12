package com.james;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TestGson {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Book book = new Book("1", "《深入Java虚拟机》");
        List<Book> books = new ArrayList<>();
        books.add(new Book("1", "《深入Java虚拟机》"));
        books.add(new Book("2", "《OpenCV进阶》"));
        books.add(new Book("3", "《深入Android源代码》"));
        book.setBookList(books);
        String[] strs = new String[]{"《深入Java虚拟机》", "《Android插件编程》", "《OpenCV全解》"};
        book.setArgs(strs);
        String str = gson.toJson(book);
        System.out.println(str);

    }
}
