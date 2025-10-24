package com.rizvi.methods;


// Pass-by-Value with Object References
public class NameValue2 {

//    Java always passes parameters by value
//
//    For objects, the reference copy is passed, not the actual object
//
//    Modifying the reference inside a method doesn't affect the original reference

    String name;
    String value;

    public NameValue2(String name, String value) {
        this.name = name;
        this.value = value;
    }
    @Override
    public String toString() {
        return "NameValue2{name='" + name + "', value=" + value + "}";
    }
    public void changeMe(NameValue2 nv){
    NameValue2 temp = nv;
    nv = new NameValue2("Country", "Canada");
        System.out.println(nv);
        System.out.println("Temp :" + temp);
    }

   // Java is considered "pass-by-value" even when working with objects.

    public static void main(String[] args) {
        NameValue2 test = new NameValue2("Country", "USA");
        System.out.println(test);
        test.changeMe(test);
        System.out.println(test);
    }
}
