package com.ohgiraffers.game;


public class Character_DTO {

    private int no; //회원번호
    private String job; // 캐릭터 직업
    private int hp; // 캐릭터 체력
    private int power; // 캐릭터 공격력


    //모든 필드를 초기화 하는 생성자

    public Character_DTO(int no, String job, int hp, int power){
        this.no =no;
        this.job=job;
        this.hp =hp;
        this.power=power;
    }


    // getter // setter  만들기 !

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    // toString!

    @Override
    public String toString() {
        return "Character{" +
                "no=" + no +
                ", job='" + job + '\'' +
                ", hp=" + hp +
                ", power=" + power +
                '}';
    }
}

