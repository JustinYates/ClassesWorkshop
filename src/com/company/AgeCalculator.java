package com.company;

import java.util.Scanner;

public class AgeCalculator extends Cat {

    public AgeCalculator(String ownerName, String petName, String homeAddress, int age, char gender, boolean likesCatnip, boolean usesLitterbox, String furType) {
        super(ownerName, petName, homeAddress, age, gender, likesCatnip, usesLitterbox, furType);

        Scanner age2 = new Scanner(System.in);
        Scanner petType = new Scanner(System.in);

        System.out.println("how old in human years is your pet?:");

        int humanAge = age2.nextInt();

        System.out.print(" okay is it a cat or dog?:");

        String type = petType.nextLine();


        System.out.print("okay so your " + type + " is only " + humanAge + " years old in human years??, nice, let me tell you how old it REALLY is.");
        int CatAge = ((humanAge - 2) * 4 + 24 );
        System.out.println(CatAge);


    }

}
