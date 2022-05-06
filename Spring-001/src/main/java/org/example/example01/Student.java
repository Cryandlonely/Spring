package org.example.example01;

public class Student {
    private String name;
    private String id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    /*public Student() {
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
