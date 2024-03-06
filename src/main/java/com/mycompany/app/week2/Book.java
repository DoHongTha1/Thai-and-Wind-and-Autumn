package com.mycompany.app.week2; 
public class Book {
        static class Book2 {
      String title;
      String author;
      int numPages;
      Book2() { } ; // default constructor
      public Book2(String t, String a, int p) {
      title = t;
      author = a;
      numPages = p;
      }
    }
      public static void main(String[] args) {
      Book2 myObj = new Book2("a","b",2); //New book
      System.out.println(myObj.numPages);
      }
     }
