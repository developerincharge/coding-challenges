package com.rizvi;

public class Employee {

    private Integer id;
    private String name;
    private int age;
    private String dept;
    private double salary;

    public Employee(Integer id, String name, int age,String dept, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';

    }
}
