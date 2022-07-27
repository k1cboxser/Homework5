package com.company;

public class Boss {
    private int bossHalts;
    private int bossDamage;
    private String bossProtectionType;


    public Boss(int bossHalts, int bossDamag, String bossProtectionType) {
        this.bossHalts = bossHalts;
        this.bossDamage = bossDamag;
        this.bossProtectionType = bossProtectionType;
    }

    public int getBossHalts() {
        return bossHalts;
    }

    public void setBossHalts(int bossHalts) {
        this.bossHalts = bossHalts;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamag(int bossDamag) {
        this.bossDamage = bossDamag;
    }

    public String getBossProtectionType() {
        return bossProtectionType;
    }

    public void setBossProtectionType(String bossProtectionType) {
        this.bossProtectionType = bossProtectionType;
    }
}
