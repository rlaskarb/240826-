package com.ohgiraffers.section02.use;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /* 학습목표 DTO(데이터 위주) 와 행위 위주의 클래스를 활용한 예제 */

        /* 필기
        * DTO 를 활용한 간단한 회원 관리 프로그램
        * 1. Application 에서 플레이어가 여려 명의 회원 정보를 받아 등록
        * 2. Application 에서 플레이어가 전체 회원 조회 시 등록 된 회원 정보 반환
        * */

        Scanner sc = new Scanner(System.in);
        MemberManager manager = new MemberManager();

        while(true){
            System.out.println("======= Hi Media 회원 관리 프로그램 =========");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴선택 : ");
            int no =sc.nextInt();


            switch(no){
                case 1 :
                    manager.signUpMembers();
                    break;
                case 2 :
                    manager.searchAllMember();
                    break;
                case 9 :
                    System.out.println("ㅇㅅㅇ 프로그램 종료중입니다. 전원을 끄지 마세요 !!");
                    return;
                default:
                    System.out.println("없는메뉴 만드는 마법 사용금지!!!");
                    break;
            }
        }

    }

}
