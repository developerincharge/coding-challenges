package com.rizvi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupEmployeeByAge {

    public static void main(String[] args) {

        List<Employee> employees = Stream.of(
                new Employee(1, "Farooq", 21,"BA", 10000),
                new Employee(2, "Rifat", 21,"DEV" , 40000),
                new Employee(3, "Syed", 55,"QA", 30000),
                new Employee(4, "Mohammad", 42,"DEV", 80000),
                new Employee(5, "Imtiaz", 21, "QA", 50000),
                new Employee(6, "Hassan", 55, "BA", 25000),
                new Employee(7, "Askari", 42, "QA", 45000),
                new Employee(8, "Shazan", 39, "DEV", 65000),
                new Employee(9, "Jundaib", 39, "IT", 50000),
                new Employee(10, "Nargis", 42, "QA", 10000),
                new Employee(11, "Rida", 42, "DEV", 15000),
                new Employee(12, "Madiha", 42, "IT", 27000),
                new Employee(13, "Batool", 29, "QA", 35000),
                new Employee(14, "Fatima", 42, "BA", 60000),
                new Employee(15, "Irtiza", 21, "QA", 90000),
                new Employee(16, "Rizvi", 55, "DEV", 100000),
                new Employee(17, "Haider", 21,"BA", 70000)).collect(Collectors.toList());

           // Group Employee By Age
        Map<Integer, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        for (Map.Entry<Integer, List<Employee>> entry : map.entrySet()) {
            System.out.println("Age : " + entry.getKey() + " -> " + entry.getValue());


            Map<String, List<Employee>> map1 = entry.getValue().stream().collect(Collectors.groupingBy(Employee::getDept));
            for (Map.Entry<String, List<Employee>> entry1 : map1.entrySet()) {
                System.out.println("Dept : " + entry1.getKey() + " -> " + entry1.getValue());
            }
        }
    }
}
