package com.rizvi.oops.company;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rizvi",45, "IT", 50000);
        Employee emp2 = new Employee("Ali", 35, "QA", 60000);

        System.out.println(emp1);
        System.out.println(emp2);
        emp1.setName("Imtiaz");
        System.out.println(emp1.getEmployeeDetails());
    }
}
