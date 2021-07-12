package com.james;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class BookTypeAdapter extends TypeAdapter<Book> {
    @Override
    public void write(JsonWriter jsonWriter, Book book) throws IOException {
        //流式序列化对象开始
        jsonWriter.beginObject();
        //将Json的key值都指定为首字母大写
        jsonWriter.name("Id").value(book.getId());
        jsonWriter.name("Name").value(book.getName());
        //流式序列化对象结束
        jsonWriter.endObject();
    }

    @Override
    public Book read(JsonReader jsonReader) throws IOException {
        Book book = new Book();
        //流式反序列化开始
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            switch (jsonReader.nextName()) {
                case "id":
                case "Id":
                    book.setId(jsonReader.nextString());
                    break;
                case "name":
                case "Name":
                    book.setName(jsonReader.nextString());
                    break;
            }
        }
        //流式反序列化结束
        jsonReader.endObject();
        return book;
    }
}
