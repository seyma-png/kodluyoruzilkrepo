package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = inp.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        double kilo = inp.nextDouble();

        double index=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " + index);
    }
}
