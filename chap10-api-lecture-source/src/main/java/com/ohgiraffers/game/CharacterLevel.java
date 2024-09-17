package com.ohgiraffers.game;

public class CharacterLevel {
    private int level;
    private int exp;
    private int hpIncrease;
    private int powerIncrease;

    public characterLevel(){
        this.level = 1;
        this.exp = 0;
        this.hpIncrease = 70;
        this.powerIncrease = 50;
    }

    public void gameExp(int amount){
        this.exp += amount;
        //경험치가 일정량 이상 쌓이면 레벨 업.
        while (this.exp >= 50){
            levelUP();
        }
    }
    private void levelUP() {
        this.level++;
        this.hpIncrease += 50;
        this.powerIncrease += 50;
        this.exp -= 50; // 레벨업 후 남은 경험치
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getHpIncrease() {
        return hpIncrease;
    }

    public void setHpIncrease(int hpIncrease) {
        this.hpIncrease = hpIncrease;
    }

    public int getPowerIncrease() {
        return powerIncrease;
    }

    public void setPowerIncrease(int powerIncrease) {
        this.powerIncrease = powerIncrease;
    }

    @Override
    public String toString() {
        return "CharacterLevel{" +
                "level=" + level +
                ", exp=" + exp +
                ", hpIncrease=" + hpIncrease +
                ", powerIncrease=" + powerIncrease +
                '}';
    }
}









