package com.ohgirafers.game;

import java.util.Scanner;

public class CharacterManager {

    public void characterManager() {
        // 직업 선택하는 switch 만들기
        Scanner sc = new Scanner(System.in);
        System.out.println("케릭터를 생성을 시작합니다.");
        System.out.println("한글입력이 안되니까 영어로 캐릭터명을 만들어보세요");
        System.out.print("캐릭터명 : ");
        sc.nextLine();
        System.out.println("그럼");
        System.out.println("케릭터를 선택하세요");
        System.out.println("1 번 : 전사 ");
        System.out.println("주로 칼을 사용하는데 가끔 주먹으로 싸웁니다");
        System.out.println();
        System.out.println();
        System.out.println("2 번 : 궁수 ");
        System.out.println("주로 활로 싸움을 하는데 밸런스 패치 실패로 화살이 없습니다.");
        System.out.println();
        System.out.println();
        System.out.println("3 번 : 마법사 ");
        System.out.println("주로 마력으로 싸움을 합니다.");
        System.out.println("그런데 마법사가 마력이 없어서 주먹으로 싸웁니다.");
        System.out.println();
        System.out.println();
        System.out.println("4 번 : 도적 ");
        System.out.println("주로 단검이나 표창을 사용합니다.");
        System.out.println("단검하고 표창을 집에 두고 왔습니다. 주먹으로 싸웁니다.");

        System.out.println();
        System.out.println();
        // 캐릭터 선택 할수 있는 기능 추가.


        //캐릭터 DTO 기능을 사용해서 직업종류와 체력과 공격력을 입력 추가.

        Character_DTO[] characters = new Character_DTO[5];
        characters[1] = new Character_DTO(1, "전사", 70, 50,0);
        characters[2] = new Character_DTO(1, "궁수", 70, 50,0);
        characters[3] = new Character_DTO(1, "마법사", 70, 50,0);
        characters[4] = new Character_DTO(1, "도적", 70, 50,0);


        while (true) {
            System.out.println("자 캐릭터를 고를 시간이 왔습니다.");
            System.out.print("몇번을 선택 하시겠습니까? : ");
            int answer = sc.nextInt();

            switch (answer) {
                case 1:
                    characters[1] = new Character_DTO(1, "전사", 70, 50,0);
                    System.out.println();
                    System.out.println("게임의 근본을 선택 하셨습니다. !!");
                    break;
                case 2:
                    characters[2] = new Character_DTO(1, "궁수", 70, 50,0);
                    System.out.println();
                    System.out.println("활은 들고 있지만 화살은 없는 궁수를 선택 하셨습니다 !!!");
                    break;
                case 3:
                    characters[3] = new Character_DTO(1, "마법사", 70, 50,0);
                    System.out.println();
                    System.out.println("마력이 없는 힘법사를 선택하셨습니다 !!");
                    break;
                case 4:
                    characters[4] = new Character_DTO(1, "도적", 70, 50,0);
                    System.out.println();
                    System.out.println("무기를 집에 두고 다니는 도적을 선택하셨습니다.!!!");
                    break;
                default:
                    System.out.println();
                    System.out.println("너무 많은걸 바라지 않았으면 좋겠어!! 다시 선택해줘 ");
                    System.out.println();
                    continue;
            }break;

        }
    }
}
