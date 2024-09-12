package com.ohgiraffers.game;

public class Monster {




    private String name;
    private int hp;
    private int attack;

    public void setName(String name){
        this.name = name;
    }

    public void setHp(int hp){
        if(hp>0){
            this.hp = hp;
        }else{
            System.out.println("게임 안만들거야?");
            this.hp = 0;
        }
    }
    public void setattack(int attack){
        if(attack>0){
            this.attack= attack;
        }else{
            System.out.println("진짜 이러기야? ");
            this.attack = 0;
        }
    }
    public String getInfo(){
        return   "몬스터 이름은 " + this.name +
                 " 체력은 " + this.hp +
                 " 공격력은 " + this.attack +
                 " 입니다." ;
    }

    public String Monster1(){
        Monster monster1 = new Monster();
        monster1.setName("슬라임");
        monster1.setHp(10);
        monster1.setattack(30);
        return getInfo();
    }
    public String Monster2(){
        Monster monster2 = new Monster();
        monster2.setName("주황버섯");
        monster2.setHp(30);
        monster2.setattack(50);
        return getInfo();
    }
    public String Monster3(){
        Monster monster3 = new Monster();
        monster3.setName("머쉬맘");
        monster3.setHp(50);
        monster3.setattack(70);
        return getInfo();
    }

}
