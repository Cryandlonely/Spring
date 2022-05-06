package org.example.example01;

public class Student02 {
    private String name;
    private String id;
    private School school;

    @Override
    public String toString() {
        return "student02{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", school=" + school +
                '}';
    }

    public Student02(String name, String id, School school) {
        this.name = name;
        this.id = id;
        this.school = school;
    }
}
