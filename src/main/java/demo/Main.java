package main.java.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Please enter your name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int length = name.length();
        System.out.println("Hi, " + name + "! Did you know your name is " + length + " characters long?");
    }
}
