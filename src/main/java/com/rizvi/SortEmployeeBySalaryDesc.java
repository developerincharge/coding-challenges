package com.rizvi;

import java.util.Comparator;

public class SortEmployeeBySalaryDesc implements Comparator<Employee> {

            // sorting salary by Descending order
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
    }
}
