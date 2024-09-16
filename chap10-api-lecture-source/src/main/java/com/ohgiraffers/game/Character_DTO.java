package com.ohgiraffers.game;


public class Character_DTO {

    private int level; //회원번호
    private String job; // 캐릭터 직업
    private int hp; // 캐릭터 체력
    private int power; //
    private int exp;// 캐릭터 공격력


    //모든 필드를 초기화 하는 생성자

    public Character_DTO(int no, String job, int hp, int power, int exp) {
        this.level =level;
        this.job=job;
        this.hp =hp;
        this.power=power;
        this.exp=exp;
    }


    // getter // setter  만들기 !

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    // toString!

    @Override
    public String toString() {
        return "Character_DTO{" +
                "level=" + level +
                ", job='" + job + '\'' +
                ", hp=" + hp +
                ", power=" + power +
                ", exp=" + exp +
                '}';
    }
}

