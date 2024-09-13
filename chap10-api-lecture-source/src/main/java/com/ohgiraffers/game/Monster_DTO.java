package com.ohgiraffers.game;

public class Monster_DTO {

    private int no; // 몬스터 번호
    private String name; // 몬스터 이름
    private int hp; // 몬스터 체력
    private int power; // 몬스터 공격력

    //모든 필드를 초기화 하는 생성자
    public Monster_DTO(int no, String name, int hp, int power ){
        this.no =no;
        this.name = name;
        this.hp = hp;
        this.power = power;
    }


    // getter // setter 만들기


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    //toString !!

    @Override
    public String toString() {
        return "Monster{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", power=" + power +
                '}';
    }
}
