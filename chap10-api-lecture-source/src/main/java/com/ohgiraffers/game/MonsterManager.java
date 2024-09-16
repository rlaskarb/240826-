package com.ohgiraffers.game;

import java.util.Scanner;

public class MonsterManager {

    public void monsterManager() {
        Monster_DTO monsterDto1 = new Monster_DTO(1, "슬라임", 40, 10, 50);
        Monster_DTO monsterDto2 = new Monster_DTO(2, "주황버섯", 60, 40, 100);
        Monster_DTO monsterDto3 = new Monster_DTO(3, "다크골렘", 100, 70, 200);
        Monster_DTO monsterDto4 = new Monster_DTO(4, "머쉬맘", 200, 100, 1000);
        Monster_DTO monsterDto5 = new Monster_DTO(5, "발록", 400, 200, 2000);
        Monster_DTO monsterDto6 = new Monster_DTO(6, "자쿰", 800, 400, 5000);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("몬스터에 대해 설명하겠습니다.");
            System.out.print("몇번 몬스터를 사냥하겠습니까? : ");
            int answer = sc.nextInt();

            switch (answer) {
                case 1:
                    monsterDto1 = new Monster_DTO(1, "슬라임", 40, 10, 50);
                    System.out.println();
                    System.out.println("슬라임 !!");
                    break;
                case 2:
                    monsterDto2 = new Monster_DTO(2, "주황버섯", 60, 40, 100);
                    System.out.println();
                    System.out.println("주황버섯 !!");
                    break;
                case 3:
                    monsterDto3 = new Monster_DTO(3, "다크골렘", 100, 70, 200);
                    System.out.println();
                    System.out.println("다크골렘 !!");
                    break;
                case 4:
                    monsterDto4 = new Monster_DTO(4, "머쉬맘", 200, 100, 1000);
                    System.out.println();
                    System.out.println("머쉬맘 !!");
                    break;
                case 5:
                    monsterDto5 = new Monster_DTO(5, "발록", 400, 200, 2000);
                    System.out.println();
                    System.out.println("발록 !!");
                    break;
                case 6:
                    monsterDto6 = new Monster_DTO(6, "자쿰", 800, 400, 4000);
                    System.out.println();
                    System.out.println("자쿰 최종 보스를 물리쳤어 !!");
                    break;

                default:
                    System.out.println();
                    System.out.println("너무 많은걸 바라지 않았으면 좋겠어!! 다시 선택해줘 ");
                    System.out.println();
                    continue;
            }
            break;
        }
    }
}