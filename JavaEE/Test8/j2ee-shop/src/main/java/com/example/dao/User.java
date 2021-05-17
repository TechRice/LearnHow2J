package com.example.dao;

/**
 * 类名：User
 * 描述：ORM（对应数据库中的 user 表）
 */
public class User {
    /* 对象属性 */
    private int id;
    private String name;
    private String password;
    private String sex;
    private String country;
    private String signature;

    /* 构造方法 */
    // 无参
    public User() {
    }
    // 有参
    public User(int id, String name, String password, String sex, String country, String signature) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.country = country;
        this.signature = signature;
    }

    /* 对象方法 */
    // getter 和 setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "[" + this.id + ", "+ this.name + ", "+ this.password + ", "+ this.sex + ", "+ this.country + ","+ this.signature + "]";
    }
}
