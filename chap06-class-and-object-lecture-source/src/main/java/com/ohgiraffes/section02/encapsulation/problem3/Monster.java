package com.ohgiraffes.section02.encapsulation.problem3;

public class Monster {

    /* 목차 1. name hp */
//    String name;
//    int hp;

    /* 목차 2. 또 마음이 바뀌었다.. 이름으 아니라 또 종류래요....*/
    String kinds;
    int hp;


    public  void  setName(String name){
        this.kinds = name;
    }

    public void  setHp(int hp) {

        if(hp>0){
            this.hp =hp;
        }else {
            this.hp = 0;
        }

    }
    // 몬스토의 정보 (이름,체력)을 알려주는 기능
    public String getInfo(){

        return "몬스터의 이름은 " + this.kinds + " 이고, 체력은 " + this.hp + " 입니다.";

    }


}
