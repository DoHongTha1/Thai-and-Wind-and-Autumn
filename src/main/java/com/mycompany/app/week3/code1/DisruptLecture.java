package com.mycompany.app.week3.code1;

public class DisruptLecture {
   public static class CellPhone {
        CellPhone() {

        }

        public void ring(Tune t) {
            t.play();
        }
    }

    public static class Tune {
        public void play() {
            System.out.println("Tune.play()");
        }
    }

    public static class ObnoxiousTune extends Tune {
        ObnoxiousTune() {
            } 
    }

        public static void main(String[] args) {
            CellPhone noiseMaker = new CellPhone();
            ObnoxiousTune ot = new ObnoxiousTune();
            noiseMaker.ring(ot); // ot works though Tune called for
        }
    }

