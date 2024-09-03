package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {
    /*학습목표 while 문 단독 사용에 대한 흐름을 이해할 수 있다.*/

    /*필기
    * [while 문 표현식]
    * 초기식;
    * while (조건식){
    *       조건을 만족하는 경우 반복 할 구문;
    *       증감식;
    * }*/

    /*목차 1 1부터10까지 1씩 증가시키면서 i값 출력하는 반복문*/

//    for(int i= 1; 1<=10; i++){
//        System.out.println(i);
//    }
  public void testWhileStatenent(){


    int i =1;
    while ( i <= 10) {
        System.out.println(i);
        i++;

    }

  }

  public void whileExample1(){
      /*목차 스캐너를 사용해서 문자열을 입력 받아 엔덱스를 이용해 한글자 씩 출력해보기*/

      Scanner sc = new Scanner(System.in);
      System.out.println("문자열을 입력해주세요 : ");
      String str = sc.nextLine();

      /*필기
      * charAt() : 문자열에서 인덱스에 해당하는 문자를 char 형으로 반환해주는 메소드
      * length() : string 클래스에서 제공하는 메소드로 문자열의 길이를 int 형으로 반환해준다.
      *
      * */

      System.out.println("============for 문====================");
      //ex) 안녕 -> 안 녕

      for(int i= 0; i<str.length(); i++){
          char ch = str.charAt(i);
          System.out.println( i + "번째 :" + ch );
      }

      System.out.println("========= while 문=================");

      int i = 0; //초기식
      //조건식
      while(i<str.length()){
          //반복 할 구문
          char ch = str.charAt(i);
          System.out.println( i + "번째 문자 :" + ch );
          // 증감식
          i++;

      }


  }

  public void whileExample2(){

      /*필기 중첩 while 문을 사용해서 구구단 출력 연습
      * dan 2~9
      * su 1~9
      * */

      //초기식
      int dan = 2;
      while(dan < 10 ){
          //초기식 su
          int su = 1;
          while(su < 10 ){
              System.out.println(dan + " * " + su + " = " + (dan*su));
              su++;
          }
          //한줄 띄어쓰기
          System.out.println();
          dan++;
      }

  }

}
