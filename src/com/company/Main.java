package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //System.out.println("Hello World!");

        byte mAge = 18;
        String mName = "Alexand";
        float sSpeed = 2.9f;
        int tCapacity = 1000000;
        boolean tr = true;
        short tWeight = 2700;
        double tPrice = 69900.99;
        long hPower = 775;
        char valuta = '$';

        System.out.println("\n Hi, my name is " + mName + ", I am " + mAge + " years old.");
        System.out.println(" I want to tell some about me, namely about my interest in car.");
        System.out.println(" I'll tell you about Tesla Cybertruck, this car can able gain speed 100 km/h per " + sSpeed + " seconds and it's fully " + tr + ".");
        System.out.println(" Thanks to three electric motors with a capacity of " + tCapacity + " Watt or 100 Kilowatt.");
        System.out.println(" The weight of this car is " + tWeight + " kg and power of " + hPower + " horsepower.");
        System.out.println(" And the last - the price which makes " + tPrice + valuta + ".");
    }
}
