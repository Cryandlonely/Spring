package org.example.domain;

public class Student01 {
    private String name;
    private String id;
    private School school;

    @Override
    public String toString() {
        return "Studnet01{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", school=" + school +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    /*public Student01() {
    }*/
}
