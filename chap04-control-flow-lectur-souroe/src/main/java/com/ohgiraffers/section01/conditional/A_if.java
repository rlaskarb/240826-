package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {


    /*수업목표 if문 단독 사용에 대한 흐음을 이해하고 적용할 수 있다.*/

    /*필기
    * [if 문의 표현식]
    * if(조건식){
    * 조건식이 true 일 때 수행할 명령문
    * }
    *
    * 필기
    * 조건식: true of false 가 나오는 연산식을 조건식 이라고 한다.
    * if 문은 조건식의 결과 값이 참(true) 이면 {} 안에 코드를 실행
    * 거짓(false)이면{} 안에 코드를 무시하고 넘어가게 된다.
    * */

    /*목표 1 문제
    * 정수 한 개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다.
    * 라고 출력하고, 짝수가 아니면 출력하지 않는 구문을 작성할 것이다.
    * 단, 조건과 상관 없이 프로그램이 종료될때 "프로그램을 종료합니다"
    * 라고 출력을 하도록 해보자.*/

    public void testSimpleIfStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나를 입력해주세요 : ");
        int num =sc.nextInt();

        /*목표 2 조건 생각해보기. 짝수=> 어떠한 수를 2로 나누었을때  나머지가 0이면 짝수다.*/
        if(num % 2 == 0 ){
            System.out.println("입력하신 숫자는 짝수입니다.");


        }

        System.out.println("프로그램을 종료합니다.");



    }

    public void testNestedIfStatement(){
        /*목차 3.문제
        * 정수를 한개를 입력 받아 그 수가 양수인 경우에는 짝수인지를 확인하여
        * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다. 를 출력하고,
        * 둘중 하나다라도 해당하지 ㅇ낳으면 아무 내용도 출력하지 않는 구문을 작성해보자.
        * 단, 조건과 상관없이 프로그램이 종료될때, "프로그램을 종료합니다." 라고
        * 줄력되도록 해보자.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 한개만 입력해보세요 :");
        int num = sc.nextInt();
        //입력한 정수가 양수인 지 확인하는 if문
        if(num>0){
            //양수가 맞을 경우 , 한 번 더 짝수인 지를 확인.
            System.out.println("입력하신 정수는 양수입니다");

            if(num%2==0){
                System.out.println("입력하신 정수는 양수이며 짝수입니다.");

            }

        }

        System.out.println("프로그램을 종료합니다.");


    }




}
