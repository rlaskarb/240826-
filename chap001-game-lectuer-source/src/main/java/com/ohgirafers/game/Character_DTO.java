package com.ohgirafers.game;


public class Character_DTO {

    private int level; //회원번호
    private String job; // 캐릭터 직업
    private int hp; // 캐릭터 체력
    private int power; //
    private int exp;// 캐릭터 공격력


    //모든 필드를 초기화 하는 생성자

    public Character_DTO(int level, String job, int hp, int power, int exp) {
        this.level =1;
        this.job=job;
        this.hp =70;
        this.power=50;
        this.exp=0;
    }

    public void gameMonster(Monster_DTO monster){
        if(this.power>monster.getHp()){
            this.exp+=monster.getExp();
            System.out.println("몬스터를 물리쳤습니다. 경험치 : " + monster.getExp() + "획득" );
            while (this.exp >= 50){
                levelUP();
            }
        }else {
            System.out.println("몬스터에게 패배하였습니다 Game Over ");
        }
    }



    private void levelUP() {
        System.out.println("레벨업!! : " + this.level);
        this.level++;
        this.hp += 50;
        this.power += 50;
        this.exp -= 50; // 레벨업 후 남은 경험치
    }


    // getter // setter  만들기 !

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

