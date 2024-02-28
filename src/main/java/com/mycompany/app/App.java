/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

/*public class App {
    public static void main(String[] args) {
        int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good bro.");
}
    }
}*/

/*  class Number {
      public int i;
}
  class App {
  public static void main(String[] args) {
    Number n1 = new Number();
    Number n2 = new Number();
    n1.i = 2;
    n2.i = 5;
    n1.i = n2.i;
    n2.i = 10; 
    System.out.println(n1.i);
  }
}*/
/*public class App {    
public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();        
        n1.i = 2;        
        n2.i = 5;        
        n1 = n2;        
        n2.i = 10; // what is n1.i?        
        n1.i = 20; // what is n2.i? 
        System.out.println(n1.i) ;
  } }*/
  /*class  App {
    static void f(Number m) {
      m.i = 15;
      }
      public static void main(String[] args) {
      Number n = new Number();
      n.i = 14;
      f(n); // what is n.i now?
      System.out.println(n.i);
      }
     }*/

     
     public class App {
        static class Book {
      String title;
      String author;
      int numPages;
      Book() { } ; // default constructor
      public Book(String t, String a, int p) {
      title = t;
      author = a;
      numPages = p;
      }
    }
      public static void main(String[] args) {
      Book myObj = new Book("a","b",2); //New book
      System.out.println(myObj.numPages);
      }
     }


  
