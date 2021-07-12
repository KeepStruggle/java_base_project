package com.james;

public class Student {
    private String id;
    private String name;
    private int age;
    private String clubId;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClubId() {
        return clubId;
    }

    public void setClubId(String clubId) {
        this.clubId = clubId;
    }

    public Student(String id, String name, int age, String clubId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.clubId = clubId;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", clubId='" + clubId + '\'' +
                '}';
    }
}
