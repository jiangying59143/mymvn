package com.my.domain;

public class User {
    private Integer Id;
    private String userName;

    private Integer age;

    private Classes classes;

    public User() {
    }

    public User(Integer id, String userName, Integer age, Classes classes) {
        Id = id;
        this.userName = userName;
        this.age = age;
        this.classes = classes;
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public User(Integer id, String userName, Integer age) {
        Id = id;
        this.userName = userName;
        this.age = age;
    }

    public User(String userName, Integer age, Classes classes) {
        this.userName = userName;
        this.age = age;
        this.classes = classes;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", classes=" + classes +
                '}';
    }
}
