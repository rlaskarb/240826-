package com.ohgiraffers.game;

import javax.swing.*;
import java.util.Scanner;

public class MonsterManager {

    public void monsterManager() {
        Monster_DTO m1 = new Monster_DTO(1, "슬라임", 40, 10, 50);
        Monster_DTO m2 = new Monster_DTO(2, "주황버섯", 60, 40, 100);
        Monster_DTO m3 = new Monster_DTO(3, "다크골렘", 100, 70, 200);
        Monster_DTO m4 = new Monster_DTO(4, "머쉬맘", 200, 100, 1000);
        Monster_DTO m5 = new Monster_DTO(5, "발록", 400, 200, 2000);
        Monster_DTO m6 = new Monster_DTO(6, "자쿰", 800, 400, 5000);


    }

    public void attackMonster() {

        Character_DTO characterDto = new Character_DTO(0, "전사", 70, 50, 0);
        CharacterManager characterManager = new CharacterManager();
        characterManager.characterManager();
        CharacterLevel characterLevel = new CharacterLevel();


        Monster_DTO monsterDto = new Monster_DTO(1, "슬라임", 40, 10, 50);
        MonsterManager monsterManager = new MonsterManager();
        monsterManager.monsterManager();


        if (characterDto.getPower() > monsterDto.getPower()) {
            System.out.println("몬스터를 물리쳤습니다.");

            if (characterLevel.getExp() >= 50) {
                characterLevel.gameExp(characterDto.getExp());
                System.out.println("레벨업을 했하셨습니다~ 체력과 공격력 이 50 증가했습니다. ");
            }
        } else {
            System.out.println("몬스터에게 공격을당해 죽었습니다. Game Over");
        }

        Scanner sc = new Scanner(System.in);


        System.out.println("몬스터에 대해 설명하겠습니다.");
        System.out.println(" 1번 : 슬라임 잡몸이죠");
        System.out.println();
        System.out.println(" 2번 : 주황버섯 잡몸이죠");
        System.out.println();
        System.out.println(" 3번 : 다크골렘 잡몹이죠");
        System.out.println();
        System.out.println(" 4번 : 머쉬맘 한때 비싼아이템을 줬던 잡몹이죠");
        System.out.println();
        System.out.println(" 5번 : 발록  중간 보스몹이죠 ~!");
        System.out.println("      한때 자랑스샷을 찍기위해 엘릭서 들고 존버했던 기억이 나네요");
        System.out.println();
        System.out.println(" 6번 : 자쿰 보스레이드 몬스터 입니다. 파티를 꾸려서 사냥을 해야하는 몬스터예요");
        System.out.println("      하지만 노가다 해서 솔로플레이해서 잡아보세요!!");
        System.out.println();

        System.out.println("케릭터는 기본적으로 체력70,공격력:50 이예요");
        System.out.println();
        System.out.println("레벨업 할때마다 체력과 공격력 50씩 증가해요");
        System.out.println();
        System.out.println("몬스터 체력과 공격력은 비밀이에요~~ ");
        System.out.println();
        System.out.println("여러번 공격해서 물리치는 걸 만들고 싶은데 한방컷하는 코딩도 개 빡셌어요 ");
        System.out.println();
        System.out.println("이거 AI 한테 조언좀 받아서 만들었는데 솔직히 3일 넘게 걸린거 같아요");
        System.out.println();
        System.out.println("그럼 즐겜 !!");
        System.out.println();
        System.out.println();
        while (true) {
            System.out.print("몇번 몬스터를 사냥하겠습니까? : ");
            int answer1 = sc.nextInt();

            switch (answer1) {
                case 1:
                    Monster_DTO m1 = new Monster_DTO(1, "슬라임", 40, 10, 50);
                    System.out.println();
                    System.out.println("슬라임 등장");
                    System.out.println();
                    if (characterDto.getPower() > m1.getHp()) {
                        CharacterLevel characterLevel1 = new CharacterLevel();
                        characterLevel1.gameExp(characterDto.getExp());
                        System.out.println("캐릭터 레벨 = " + characterLevel.getLevel());
                        System.out.println("케릭터 체력 = " + characterLevel1.getHpIncrease());
                        System.out.println("케릭터 공격력 = " + characterLevel1.getPowerIncrease());
                    } else {
                        System.out.println("슬라임에게 맞아 죽었습니다. Game Over");
                    }continue;
                case 2:
                    Monster_DTO m2 = new Monster_DTO(2, "주황버섯", 60, 40, 100);
                    System.out.println();
                    System.out.println("주황버섯 등장");
                    System.out.println();
                    if (characterDto.getPower() > m2.getHp()) {
                        System.out.println("캐릭터 레벨 = " + characterLevel.getLevel());
                        System.out.println("케릭터 체력 = " + characterLevel.getHpIncrease());
                        System.out.println("케릭터 공격력 = " + characterLevel.getPowerIncrease());

                    }continue;

            }


        }
    }
}