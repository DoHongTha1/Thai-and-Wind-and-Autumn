package com.mycompany.app.week3.code2;

public 

void adjust() {
    System.out.println("Percussion.adjust()");
}
}

class Stringed extends Orchestra {
void play() {
    System.out.println("Stringed.play()");
}

String what() {
    return "Stringed";
}

void adjust() {
    System.out.println("Stringed.adjust()");
}
}

class Woodwind extends Wind {
void play() {
    System.out.println("Woodwind.play()");
}

String what() {
    return "Woodwind";
}
}

class Brass extends Wind {
void play() {
    System.out.println("Brass.play()");
}

String what() {
    return "Brass";
}
}
    
}
