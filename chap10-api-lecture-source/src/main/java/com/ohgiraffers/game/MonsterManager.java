package com.ohgiraffers.game;

public class MonsterManager {

    public void monsters() {
        Monster_DTO[] monster = new Monster_DTO[7];
        monster[1] = new Monster_DTO(1, "슬라임", 40, 10);
        monster[2] = new Monster_DTO(2,"주황버섯",60,40);
        monster[3] = new Monster_DTO(3,"다크골렘",100,70);
        monster[4] = new Monster_DTO(4,"머쉬맘",200,100);
        monster[5] = new Monster_DTO(5,"발록",400,200);
        monster[6] = new Monster_DTO(6,"자쿰",800,400);


        System.out.println("숲속에 몬스타들이 살고 있어요");
        System.out.println("그 몬스터를 잡아가면서 랩업을 하면서 최종 보스를 잡아서 승리하세요");





    }

}
