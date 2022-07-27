package com.company;

public class Main {

    public static void main(String[] args) {
        Boss iceDragon = new Boss(1000, 100,
                "Ice");
        System.out.println("Ice Drago" +" Halts"+" [" +iceDragon.getBossHalts()+"] "+"Protection type" +" [" + iceDragon.getBossProtectionType()+"] "+"Damage" +" [" + iceDragon.getBossDamage()+"] " );

    }

}
