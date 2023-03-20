package be.intecbrussel;

import java.util.Scanner;

public class OefWrapper {
    public static void main(String[] args) {

        //Wrapper classSchrijf een Java-programma dat de gebruiker vraagt
        // een decimaal getal in te voeren en de volgende bewerkingen uitvoert met
        // behulp van Wrapper-klassen:
        // Converteert het decimale getal naar een geheel getal en drukt het resultaat af.
        // Converteert het decimale getal naar een double en drukt het resultaat af.
        // Berekent de absolute waarde van het decimale getal en drukt het resultaat af.
        // Genereert een willekeurig geheel getal tussen 1 en de gehele waarde van het decimale getal (inclusief)met behulp van
        // de klasse Random en drukt het resultaat af.


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Voer een decimaal getal in: ");


        //Oe01


//        Float decimaalGetal = scanner.nextFloat();
//
//
//        System.out.println(decimaalGetal.intValue());

        //Oef02

//        Float decimaalGetal = scanner.nextFloat();
//        System.out.println(decimaalGetal.doubleValue());


        //Oef03


//        Float decimaalGetal = scanner.nextFloat();
//
//        System.out.println(Math.abs(decimaalGetal));
//


        //Oef04

        System.out.println("Voer een decimaal getal in dat groter is dan 1 : ");


        Float decimaalGetal = scanner.nextFloat();


        System.out.println(decimaalGetal.intValue());


        double result = Math.random();

        System.out.println(result);

    }
}
