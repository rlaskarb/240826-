package com.ohgiraffers.section01.array;

import java.util.Random;
import java.util.Scanner;

public class EX {

    public static void main(String[] args) {

       /*index 1번문제*/
        /* Q1.길이가 10인 정수형 배열을 선언 및
        할당한 뒤 각 인덱스에  차례대로
        1부터 10까지 값을 넣고 출력하세요.
        * */

//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i+1;
//            System.out.print(arr[i]);
//        }


        /*index 2번문제 */

        /* 1. 길이가 5인 String 배열 선언
         * 2. "딸기", "바나나", "복숭아", "키위", "사과"로 초기화
         * 3. 스캐너로 0부터 4까지의 정수를 입력받아
         * 4. 해당 정수의 인덱스에 있는 과일을 출력
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.
         * */
//
//        String[] fruit = {"복숭아","딸기","바나나","키위","사과"};
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("0부터 4까지 정수를 입력하세요 : ");
//        int number = sc.nextInt();
//
//        if(number>=0 && number<=4){
//            System.out.println(fruit[number]);
//
//        }else {
//            System.out.println("준비된 과일이 없습니다.");
//        }

        /*index 3번문제*/

        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력받은 검색할 문자가 배열에 몇 개 있는지를 출력하세요.
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         * 검색할 문자를 입력하세요 : l
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         *
         * -- 고려 사항 --
         * 문자배열, 반복문, charAt(), length(), 갯수를 담을 변수
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력 하세요 : ");
        String str = sc.nextLine();
        System.out.print("검색할 문자를 입력하세요 : ");
        char ch = sc.next().charAt(0);

        int count = 0;

        char[] arr = new char[str.length()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        //아래 한 문장으로 문자열을 문자형 배열로 바꿀 수 있음.
//        char arr [] = str.toCharArray();

        for(int i=0; i <arr.length; i++){
            if(arr[i] == ch){
                count++;
            }
        }
        System.out.println("입력하신 문자열" + str + "에서 찾으시는 문자" + ch + "는" + count +"개 입니다.");
    }
}


/*z*/
