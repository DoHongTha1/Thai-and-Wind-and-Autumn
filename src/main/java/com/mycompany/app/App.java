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

import com.mycompany.app.week3.code1.GlyphTest;
import com.mycompany.app.week3.code1.Transmogrify;
import com.mycompany.app.week3.code1.GlyphTest.RoundGlyph;
import com.mycompany.app.week3.code1.Transmogrify.Stage;
import com.mycompany.app.week3.code2.Orchestra;
import com.mycompany.app.week3.code2.Orchestra.Wind;

class Number {
  public int i;
}

class App {
  public static void main(String[] args) {
      Orchestra a = new Orchestra();
      Wind wind = a.new Wind();
      wind.play();
      
  }
}