package sk.kosickaakademia.illiaspivak.regex;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Objansky ob = new Objansky();
        NoRegex nr = new NoRegex();
        String n = "SK095432";
        System.out.println(ob.isValidOP(n));
        System.out.println((nr.isValidSPZ(n)));

    }
}
