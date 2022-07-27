package com.company;

public class Hero {
    private int heroHalts;
    private int heroDamag;
    private String heroSuperpower;

    public Hero(int heroHalts, int heroDamag, String superpower) {
        this.heroHalts = heroHalts;
        this.heroDamag = heroDamag;
        this.heroSuperpower = superpower;
    }


    public Hero(int heroHalts, int heroDamag) {
        this.heroHalts = heroHalts;
        this.heroDamag = heroDamag;
    }

    public int getHeroHalts() {
        return heroHalts;
    }

    public void setHeroHalts(int heroHalts) {
        this.heroHalts = heroHalts;
    }

    public int getHeroDamag() {
        return heroDamag;
    }

    public void setHeroDamag(int heroDamag) {
        this.heroDamag = heroDamag;
    }

    public String getSuperpower() {
        return heroSuperpower;
    }

    public void setSuperpower(String superpower) {
        this.heroSuperpower = superpower;
    }
}
