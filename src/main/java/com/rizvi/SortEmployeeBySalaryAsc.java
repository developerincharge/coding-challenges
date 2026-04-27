package com.rizvi;

import java.util.Comparator;

public class SortEmployeeBySalaryAsc implements Comparator<Employee> {

    // sorting salary by Ascending order
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}