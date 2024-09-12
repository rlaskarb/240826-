package com.ohgiraffers.game;

import java.util.Scanner;

public class Charater {

    public void Charater() {
        Scanner sc = new Scanner(System.in);
        System.out.print("캐릭터의 이름을 설정하세요 : ");
        sc.nextLine();

        System.out.println("직업 선택 1. 전사 : 주로 칼로 싸웁니다.");
        System.out.println("직업 선택 2. 궁수 : 주로 활로 싸웁니다.");
        System.out.println("직업 선택 3. 마법사 : 주로 지팡이로 싸웁니다. ");
        System.out.println("직업 선택 4. 클레릭 : 주로 주먹으로 싸웁니다.");
        System.out.print("직업을 선택하세요 :  ");
        int answer = sc.nextInt();

        if (answer == 1) {
            System.out.println("전사로 직업을 선택 하셨습니다.");
        } else if (answer == 2) {
            System.out.println("궁수로 직업을 선택 하셨습니다.");
        } else if (answer == 3) {
            System.out.println("마법사로 직업을 선택 하셨습니다.");
        } else if (answer == 4) {
            System.out.println("클레릭으로 직업을 선택 하셨습니다.");
        }

        System.out.println("처음 시작 기본 능력치는 체력: 70 / 공격력 : 30 입니다.");
        System.out.println("레벨업을 할때마다 체력과 공격력이 20씩 증가합니다.");


    }

}
