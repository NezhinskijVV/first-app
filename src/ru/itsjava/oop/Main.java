package ru.itsjava.oop;

public class Main {

    public static void main(String[] args) {

        Lion simba = new Lion();

//        int[] array = new int[]{1,2,3};

        Lion nala = new Lion("Nala");

        simba.sayR();
        nala.sayR();


        simba.setName("Симба");
        String simbaName = simba.getName();
        System.out.println(simbaName);

        simba.setName("Король Симба");
        System.out.println("simba.getName() = " + simba.getName());

        simba.sayMeow();

        Cat bagira = new Panther();

        bagira.sayMeow();


    }
}
