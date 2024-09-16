package com.ohgiraffers.game;

public class CharacterLevel {
    private int level;
    private int exp;
    private int hpIncrease;
    private int powerIncrease;

    public CharacterLevel(){
        this.level = 1;
        this.exp = 0;
        this.hpIncrease = 70;
        this.powerIncrease = 30;
    }

    public void gameExp(int amount){
        this.exp += amount;
        //경험치가 일정량 이상 쌓이면 레벨 업.
        while (this.exp >= 100){
            levelUP();
        }
    }
    private void levelUP() {
        this.level++;
        this.hpIncrease += 50;
        this.powerIncrease += 50;
        this.exp -= 100; // 레벨업 후 남은 경험치
        System.out.println("레벨업!! 현재 레벨 : " + this.exp / 100 + "입니다.");
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

    public void attackMonster(){
        CharacterLevel monster = new CharacterLevel();
        if(this.exp > monster.getExp() ){
            System.out.println("몬스터를 물리쳤습니다. 경험치 : " + monster.getExp() + "획득");
        }else {
            System.out.println("몬스터에게 공격을당해 죽었습니다.");
        }
    }




}








