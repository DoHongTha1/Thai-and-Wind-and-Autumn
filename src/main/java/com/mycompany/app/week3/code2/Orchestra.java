package com.mycompany.app.week3.code2;

public class Orchestra {
    public abstract class Intrusment {
        abstract void play();

        String what() {
            return "";
        }

        abstract void adjust();
    }

    public class Wind extends Intrusment {
        public void play() {
            System.out.println("Wind.play() abc ");
        }

        String what() {
            return "Wind";
        }

        void adjust() {
            System.out.println("Wind.adjust())");
        }
    }

    class Percussion extends Orchestra {
        void play() {
            System.out.println("Percussion.play()");
        }

        String what() {
            return "Percussion";
        }

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
        public void play() {
            System.out.println("Woodwind.play()");
        }

        String what() {
            return "Woodwind";
        }
    }

    class Brass extends Wind {
        public void play() {
            System.out.println("Brass.play()");
        }

        String what() {
            return "Brass";
        }
    }
}