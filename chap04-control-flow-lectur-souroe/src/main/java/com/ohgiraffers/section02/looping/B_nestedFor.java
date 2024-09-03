package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanTowToNinie(){
        //2에서9단 까지의 구구단 모두 출력
        // 단 -> 2~9
        // 수 -> 1~9

        for(int dan =2;dan<=9;dan++){
            for(int su =1;su<=9;su++){
                System.out.println(dan + " * " + su + " = " + (dan*su));
            }
            //한줄 띄우기
            System.out.println();
        }

    }
    // 1~3 복습 매개변수,전달인자
    public void upgradeGugudanTowToNine(){

        for(int dan=2; dan<=9; dan++){
            printGugudanof(dan);
            //한줄 띄어쓰기
            System.out.println();

        }

    }

    private void printGugudanof(int dan) {
        // 어떤 값을 전달 받는지 확인하는 출력문
        System.out.println("dan = " + dan);

        for(int su =1; su<=9; su++){
            System.out.println(dan + " * " + su + " = " + (dan*su));

        }

    }

    public void printStarInputRowTimes() {

        /*필기
         * 키보드로 정수를 입력 받아 해당 정수 만큼
         * 한 행에 "*" 을 5개씩 출력하는 구문
         * */

        //3
        //*****
        //*****
        //*****

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력해주세요 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
//         for(int j =1; j <=5; j++){
//             System.out.print("*");
//         }

            printStar(5);

            //한줄 띄우기
            System.out.println();

        }
    }

    private void printStar(int times) {

        for(int i=1; i <=times; i++){
            System.out.print("*");

        }

    }


}



