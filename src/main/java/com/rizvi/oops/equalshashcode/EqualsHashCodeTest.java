package com.rizvi.oops.equalshashcode;

public class EqualsHashCodeTest {

    public static void main(String[] args) {
        Person person1 = new Person("001","Rizvi",55);
        Person person2 = new Person("001","Syed",45);
        Person person3 = new Person("001","Rizvi",55);

        if(person1.equals(person3)) {
            System.out.println("Equals");
        }else{
            System.out.println("NotEqual");
        }
    }
}
