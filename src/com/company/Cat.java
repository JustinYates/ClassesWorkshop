package com.company;

public class Cat extends Pet{

private boolean likesCatnip;
private boolean usesLitterbox;
private String furType;

    public Cat(String ownerName, String petName, String homeAddress, int age, char gender, boolean likesCatnip, boolean usesLitterbox, String furType) {
        super(ownerName, petName, homeAddress, age, gender);
        this.likesCatnip = likesCatnip;
        this.usesLitterbox = usesLitterbox;
        this.furType = furType;
    }


}
