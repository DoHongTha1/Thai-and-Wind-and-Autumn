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
 */

import com.mycompany.app.week2.Recursion;

class Number {
      public int i;
}
  class App {
  public static void main(String[] args) {
   Recursion r = new Recursion();
   System.out.println( r.factorial(5));
   Number n1 = new Number();
   Number n2 = new Number();
   n1.i = 2;
   n2.i = 5;
   n1.i = n2.i;
   n2.i = 10;// what is n1.i?
   System.out.println(n1.i);
  }
}