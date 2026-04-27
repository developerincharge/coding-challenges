package com.rizvi.collections;


import java.util.PriorityQueue;
import java.util.StringJoiner;



class StudentPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new java.util.Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() -o2.getGrade();
            }
        });

        queue.offer(new Student("Syed", 'C'));
        queue.offer(new Student("Imtiaz", 'B'));
        queue.offer(new Student("Rizvi", 'C'));
        queue.offer(new Student("Nargis", 'D'));
        queue.offer(new Student("John", 'F'));
        queue.offer(new Student("Doe", 'B'));
        queue.offer(new Student("Sabur", 'A'));

        //System.out.printf("Queue is:  %s ", queue);
        System.out.printf("Got %s\n ", queue.poll());
        System.out.printf("Got %s\n ", queue.poll());
        System.out.printf("Got %s\n ", queue.poll());
        System.out.printf("=Got %s\n ", queue.poll());
        System.out.printf("Got %s\n ", queue.poll());

    }

    private static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                    .add("name='" + name + "'")
                    .add("grade=" + grade)
                    .toString();
        }
    }
}
