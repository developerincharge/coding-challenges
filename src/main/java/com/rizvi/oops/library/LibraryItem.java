package com.rizvi.oops.library;

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public void checkout(){
        System.out.println("Checkout Book");
    }

    private void returnItem(){
        System.out.println("Returned Book");
    }

}
