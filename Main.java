package zes;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz wartosc Re:");
        double re = scanner.nextDouble();

        System.out.println("Wpisz wartosc Im:");
        double im = scanner.nextDouble();

        zespolona x = new zespolona(im, re);
        System.out.println("Twoja liczba to:");
        x.print();
        int listSize = 10;
        Random randomGen = new Random();
        zespolona[] arrayOfX = randomGen.doubles(listSize).mapToObj(i -> new zespolona(i, randomGen.nextDouble())).toArray(zespolona[]::new);

        System.out.println("Random array:");
        for(zespolona i : arrayOfX) {
            i.print();
        }

        System.out.println("Random array:");

    }
}
