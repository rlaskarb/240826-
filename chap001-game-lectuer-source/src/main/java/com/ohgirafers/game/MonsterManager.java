package com.ohgirafers.game;

import java.util.Scanner;

public class MonsterManager {

    public void monsterManager() {
        Character_DTO cDto = new Character_DTO(1, "전사", 70, 50, 0);

        Scanner sc = new Scanner(System.in);

        Monster_DTO m1 = new Monster_DTO(1, "슬라임", 40, 40, 50);
        Monster_DTO m2 = new Monster_DTO(2, "주황버섯", 60, 60, 100);
        Monster_DTO m3 = new Monster_DTO(3, "다크골렘", 100, 100, 200);
        Monster_DTO m4 = new Monster_DTO(4, "머쉬맘", 400, 400, 500);
        Monster_DTO m5 = new Monster_DTO(5, "발록", 800, 800, 1000);
        Monster_DTO m6 = new Monster_DTO(6, "자쿰", 1200, 1200, 2000);


        while (true) {

            System.out.println("사냥터로 들어가 몬스터를 사냥하세요");
            System.out.println("몬스터 1~6 까지 만들었어요");
            System.out.println("랩업해서 강해지면 더 쎈 몬스터를 잡을수 있어요");

            System.out.print("몇번 사냥터로 들어가 시겠습니까? : ");
            int answer = sc.nextInt();

            switch (answer) {
                case 1:
                    cDto.gameMonster(m1);
                    System.out.println("슬라임 등장!!!!!");
                    System.out.println();
                    System.out.println("현재 체력 :" + cDto.getHp());
                    System.out.println("현재 공격력 :" + cDto.getPower());
                    continue;
                case 2:
                    cDto.gameMonster(m2);
                    System.out.println("주황버섯 등장!!!!");
                    System.out.println();
                    System.out.println("현재 체력 :" + cDto.getHp());
                    System.out.println("현재 공격력 :" + cDto.getPower());
                    break;
                case 3:
                    cDto.gameMonster(m3);
                    System.out.println("다크 골렘 등장!!!!");
                    System.out.println("현재 체력 :" + cDto.getHp());
                    System.out.println("현재 공격력 :" + cDto.getPower());
                    break;
                case 4:
                    cDto.gameMonster(m4);
                    System.out.println("머쉬맘 등장!!!!!");
                    System.out.println();
                    System.out.println("현재 체력 :" + cDto.getHp());
                    System.out.println("현재 공격력 :" + cDto.getPower());
                    break;

                case 5:
                    cDto.gameMonster(m5);
                    System.out.println("발록 등장!!!!!");
                    System.out.println();
                    System.out.println("현재 체력 :" + cDto.getHp());
                    System.out.println("현재 공격력 :" + cDto.getPower());
                    break;
                case 6:
                    cDto.gameMonster(m6);
                    System.out.println("자쿰 등장 !!!!!!");
                    System.out.println();
                    System.out.println("지금까지 만든 몬스터를 전부 물리치셨습니다.");
                    System.out.println("축하합니다!!!");
                    break;
                default:
                    System.out.println("Game Over");
                    break;
            }
            break;
        }

    }

}