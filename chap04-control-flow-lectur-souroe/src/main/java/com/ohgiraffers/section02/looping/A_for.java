package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement(){

        /*학습목표 for 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/

        /*필기
        * [for 문 표현식]
        * for( 초기식; 조건식; 증감식 ){
        *   조건을 만족하는 경우 수행할 구문(반복 구문);
        * }
        * */
        //목차 문제.1 부터 10까지 1씩 증가시키면서 i 값을 출력하는 반복문
        //초기식: int i =1;
        //조건식: i <=10;
        //증감식:i++
        for(int i =1; i<=10; i++) { // 초기식;조건식;증감식
            System.out.println(i); //i fot 문 안에서 사용 지역변수.


        }


    }

    public void testForExample1(){

        /*학습목표 무엇을 반복 하는 지를 확인해서 반복문으로 개선할 수 있다.*/
        /*필기
        * 10명의 학생 이름을 입력받아 이름을 출력해보자
        * */

        Scanner sc =new Scanner(System.in);

        System.out.println("===================================");
        String student1 = sc.nextLine();
        System.out.println("1번째 학생이름은" + student1 +" 입니다");
        String student2 = sc.nextLine();
        System.out.println("2번째 학생이름은" + student2 +" 입니다");
        String student3 = sc.nextLine();
        System.out.println("3번째 학생이름은" + student3 +" 입니다");
        String student4 = sc.nextLine();
        System.out.println("4번째 학생이름은" + student4 +" 입니다");
        String student5 = sc.nextLine();
        System.out.println("5번째 학생이름은" + student5 +" 입니다");
        String student6 = sc.nextLine();
        System.out.println("6번째 학생이름은" + student6 +" 입니다");
        String student7 = sc.nextLine();
        System.out.println("7번째 학생이름은" + student7 +" 입니다");
        String student8 = sc.nextLine();
        System.out.println("8번째 학생이름은" + student8 +" 입니다");
        String student9 = sc.nextLine();
        System.out.println("9번째 학생이름은" + student9 +" 입니다");
        String student10 = sc.nextLine();
        System.out.println("10번째 학생이름은" + student10 +" 입니다");

        /*필기
        * 반복해야 하는 내용
        * 1 안내문구
        * 2학생의 이름 입력 받아 변수에 저장
        * 3 저장된 이름을 출력*/
        System.out.println("==========================================");

        /*필기
        * 둘 중 어떤 코드가 좋은 코드일까??
        * 둘다 좋은 코드다. Why? -> 요구사항 만족 했기 때문에 좋은 코드다.
        * 하지만, 반복문을 사용하는 것이 더 좋은 코드다.
        * 1. 보다 간결하게 작성이 되었다.(가독성이 상승)
        * 2. 학생의 이름 뿐 아니라, 성적이나 이름을 입력하는
        *    기능도 추가를 해야 한다면?(유지 보수성 상승)
        * */

        for(int i = 1;i<=10;i++){
            System.out.println(i+ "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i +"번째 학생의 성적을 입력해주세요 :");
            String grade = sc.nextLine();
            System.out.print( i+ "번째 학생의 이름은" + student +  "입니다. ");
            System.out.print("성적은 " + grade + "입니다.");
        }

    }


    public void testForExample2(){
        /* */

        int num1 =1;
        int num2 =2;
        int num3 =3;
        int num4 =4;
        int num5 =5;
        int num6 =6;
        int num7 =7;
        int num8 =8;
        int num9 =9;
        int num10 =10;



        // 합계를 저장하는 변수
        int sum = 0;
        sum += num1; //1
        sum += num2; //2
        sum += num3; //3
        sum += num4; //4
        sum += num5; //5
        sum += num6; //6
        sum += num7; //7
        sum += num8; //8
        sum += num9; //9
        sum += num10; //10

        System.out.println("sum : " + sum);

        System.out.println("===============================");

        int sum2 =0;

        for(int i =1; i<=10; i++){
            sum2 += i;

        }
        System.out.println("sum2 : " + sum2 );



    }


    public void testForExample3(){
        /* 목차 1. 문제
        * 5 ~ 10 사이의 난수를 발생시켜서
        * 1부터 발생한 난수까지의 합계를 구해보자.
        * */

        int random = (int)(Math.random()*6)+5;
        //결과를 담을 변수
        int sum =0;
        //초기식: int i = 1;
        //조건식: i <= random
        //증감식: i++

        for(int i=1; i<=random; i++){
            sum += i;
        }
        System.out.println("1부터" +random +"까지의 합은 :" + sum);
    }

    public void testForExample4(){
        /*필기
        * 숫자 2개를 입력 받아서 작은수에서 큰수까지의 합을 구하세요
        * 단, 두 숫자는 같지 않다 를 가정하에 진행한다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.print("두번쨰 정수 입력 : ");
        int second = sc.nextInt();

        // 합산결과를 담을 변수를 만들어두기.
        int sum =0;

//        for(int i =first; i<=second; i++){
//
//            sum += i;
//
//            System.out.println("sum :" + sum);
//        }

        //만약 첫 번째 입력 정수가 더 큰 경우
        if(first>second) {
            for(int i = second; i <= first;i++ ){
                sum += i;
            }

        }else {// 만약 두번째 입력 정수가 더 큰 경우
            for(int i = first; i<=second;i++){
                sum += i;
            }

        } System.out.println("sum :" + sum);


    }


    public void printSimpleGugudan(){

        /*필기
        * 스캐너로 2~9사이의 구구단을 받아
        * 2~9 사이인 경우 구구단을 출력하고,
        * 그렇지 않은 경우 [반드시 2~9 사이의 양수를 입력해주세요]-경고문작성
        * 를 출력해보자.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("구구단의 단수를 입력해주세요 : ");
        int dan =sc.nextInt();

        if(dan>=2 && dan <=9){

            for(int su =1; su <=9; su++){
                System.out.print(dan + " * " + su + " = " +(dan*su));

            }


        }else{
            //dan 2~9사이가 아닌경우 작성해야 할 영역
            System.out.println("반드시 2~9사이의 양수를 입력해주세요!!!");
        }

    }



}
