package com.rizvi;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEmployeeWithHighestSalary {

    public static void main( String[] args ) {

        List<Employee> employees = Stream.of(
                new Employee(1, "Farooq", 21,"BA", 10000),
                new Employee(2, "Rifat", 23,"DEV" , 40000),
                new Employee(3, "Syed", 35,"QA", 30000),
                new Employee(4, "Mohammad", 42,"DEV", 80000),
                new Employee(5, "Imtiaz", 29, "QA", 50000),
                new Employee(6, "Hassan", 25, "BA", 25000),
                new Employee(7, "Askari", 48, "QA", 45000),
                new Employee(8, "Shazan", 30, "DEV", 65000),
                new Employee(9, "Jundaib", 39, "IT", 50000),
                new Employee(10, "Nargis", 15, "QA", 10000),
                new Employee(11, "Rida", 29, "DEV", 15000),
                new Employee(12, "Madiha", 32, "IT", 27000),
                new Employee(13, "Batool", 29, "QA", 35000),
                new Employee(14, "Fatima", 46, "BA", 60000),
                new Employee(15, "Irtiza", 29, "QA", 90000),
                new Employee(16, "Rizvi", 65, "DEV", 100000),
                new Employee(17, "Haider", 19,"BA", 70000)).collect(Collectors.toList());

         System.out.println("================================== Highest Max Salary  ===================================");
        employees.stream().max((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1).ifPresent(System.out::println);

        System.out.println("================================ By using Function Max Salary 2nd method ===================================");
        employees.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
        System.out.println("==================================  Comparator  ===================================");
        Comparator<Employee> comparingBySalary = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> map  =  employees.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.reducing(BinaryOperator.maxBy(comparingBySalary))));
        System.out.println(map);

        System.out.println("==========================  Sort() Comparing by name =============================");

        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        employees.forEach(emp -> System.out.println(emp));

        System.out.println("====================================  using Comparator and Method Reference ===================================");

        employees.sort(Comparator.comparing(Employee::getName));
        employees.forEach(System.out::println);
        System.out.println("==============================  Comparator thenComparing by Name and Age   ==============================");

        employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge));
        employees.forEach(System.out::println);


        System.out.println("===========================   Comparator comparing Employee Salary    ===============================");
        employees.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);


        System.out.println("=================================   Comparator comparing Employee Salary   ===============================");

        Map<String, Employee> map1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                Optional::get))).entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        map1.forEach((k, v) -> System.out.println(k + " " + v.getSalary()));


        System.out.println("=====================================  Comparator comparing Employee Age  ===============================");

        Map<String, Employee> map2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)),
                                Optional::get))).entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        map2.forEach((k, v) -> System.out.println(k + " " + v.getAge()));


        System.out.println("=====================================  Create Comparator for Employees Name and Age  ===============================");

         Comparator<Employee> sortingByName = (emp1, emp2) -> emp1.getName().compareTo(emp2.getName());
         Comparator<Employee> SortingByAge = (emp1, emp2) -> emp1.getAge() - emp2.getAge();
         Comparator<Employee>sortingEmployeesByNameAndAge = sortingByName.thenComparing(SortingByAge);
        employees.stream().sorted(sortingEmployeesByNameAndAge).forEach(System.out::println);


        System.out.println("=====================================  Comparator for Employees Name and Age  ===============================");

        Comparator<Employee> sortByNameAndAge = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
        employees.stream().sorted(sortByNameAndAge).forEach(System.out::println);

        System.out.println("=====================================  Comparator using SortEmployeeBySalary()  ===============================");


        //employees.sort(new SortEmployeeBySalaryAsc());
        employees.sort(new SortEmployeeBySalaryDesc());
        employees.forEach(System.out::println);
    }
}
