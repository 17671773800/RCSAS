package com.hxf.student;

public class Student {
    private String id;
    private String password;
    private String name;
    private String age;
    private String cellPhoneNumber;
    private String email;
    private String type;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "student.Student{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cellPhoneNumber='" + cellPhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getString() {
        return id+","+password+","+name+","+age+","+cellPhoneNumber+","+email+","+type;
    }
}
