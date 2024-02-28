/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

 package com.mycompany.app;

 public class App {
     static class Book {
         String title;
         String author;
         int numPages;
 
         Book() {
         }; // default constructor
 
         public Book(String t, String a, int p) {
             title = t;
             author = a;
             numPages = p;
         }
     }
 
     public static void main(String[] args) {
         Book myObj = new Book("a", "b", 2); // New book
         System.out.println(myObj.title);
     }
 }
 