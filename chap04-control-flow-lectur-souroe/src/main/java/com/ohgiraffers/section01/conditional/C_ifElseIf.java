package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    /*수업목표 if, if-else-if 문 단독 사용에 대한 흐름 이해하고 적용할 수 있다. */

    /*필기
    * [if-else-if 문 표현식]
    * if(조건식1) {
    *       조건식 1이 true 일 때 실행할 구문;
    * }else if(조건식2) {
    *       조건식 1이 false 이고 조건식 2가 true 일 때 실행할 구문;
    * }else{
    *   위의 조건 2개가 모두 거짓일 경우 실행할 구문;
    * }
    * */
    /* 필기
    * if-else-if 문은 조건식 1의 결과 값이 참(true)이면 if{} 블럭실행,
    * 조건식 1이 false 이면 조건식 2를 확인하여 참(true) 이면 else if{}
    * 블럭 실행한다.
    * 조건식 1,2 의 결과가 모두 거짓(false)이면 else{} 블럭을 실행한다.
    * */

    public void testIfElseIfStatement(){
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 " +
                "말았다..(이거 백퍼 일부러 그랬음)(전설의 시작)");

        System.out.println(" 그때 연못에서 마케팅 팀장인 산신령이 나타나 금도끼,은도끼, 쇠도끼를 들고 나타나서");

        System.out.println("나무꾼에게 페이크를 시전하는데 ");

        System.out.println("========================================");

        System.out.print("산신령: 님 도끼 뭔줄 앎?(1. 금도끼 , 2. 은도끼 , 3. 쇠도끼 : ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(answer ==1){
            System.out.println("산신령 : 선넘네");
        } else if(answer ==2){
            System.out.println("산신령 : ㅎㅎㅎㅎ 진심?");
        }else if(answer ==3){
            System.out.println("산신령 :이번에 너가 착해서 이 쇠도끼를 너에게 돌려주마 너가 다른사람한테 전달해서 다른 나무꾼한테도 우물에 도끼를 빠뜨리라고 전파하렴 ㅎㅎㅎㅎ");
        }else{
            System.out.println("산신령: ???????????????? ");
        }
        System.out.println("이렇게 이야기는 끝이 났습니다.");
    }


    public void testNestedIfElseIfStatement(){
        /*필기 중첩 된 if-else-if 구문 */

        /*목차 1 문제
        * ohgiraffers 대학교의 조** 교수는 학생들의 성적을 입력해서
        * 학점 등급을 매기는 채점 방식을 사용하고 있다.
        * 학생의 이름과 점수를 입력 받아
        * 90점 이상이면 'A', 80점 이상이면 'B' , 70점 이상이면 'C' ,
        * 60점 이상이면 'D', 60점 미만이면 'F' 학점을 줄것이다.
        * 추가로 각 등급의 중간점수 (ex 95,85,75,65) 이상이면
        * '+' 를 붙여 줄 것이다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print(" 학생의 이름을 입력하세요 : " );
        String name = sc.nextLine();
        System.out.print(" 학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        String grade = "";

        if (point >= 90) {
            grade ="A";

            if(point>=95){
                grade ="+"; // grade = grade + "+"

            }
        }else if(point>=80){
            grade ="B";

            if(point>=85){
                grade = "+";

            }
        }else if(point>=70){
            grade ="C";

            if(point>=75){
                grade ="+";

            }
        }else if(point>=60){
            grade = "D";

            if(point>=65){
                grade ="+";

            }
        }else if(point>60){
            grade ="F";
        }
        System.out.println(name + "학생의 점수는 " + grade +" 학점 입니다. ");
        }


public void testNestedIfElseIfStatement2(){
/*필기 중첩 된 if-else-if 구문 */

/*목차 1 문제
 * ohgiraffers 대학교의 조** 교수는 학생들의 성적을 입력해서
 * 학점 등급을 매기는 채점 방식을 사용하고 있다.
 * 학생의 이름과 점수를 입력 받아
 * 90점 이상이면 'A', 80점 이상이면 'B' , 70점 이상이면 'C' ,
 * 60점 이상이면 'D', 60점 미만이면 'F' 학점을 줄것이다.
 * 추가로 각 등급의 중간점수 (ex 95,85,75,65) 이상이면
 * '+' 를 붙여 줄 것이다.
 * */

Scanner sc = new Scanner(System.in);
        System.out.print(" 학생의 이름을 입력하세요 : " );
String name1 = sc.nextLine();
        System.out.print(" 학생의 점수를 입력하세요 : ");
int point1 = sc.nextInt();

String grade1 = "";

        if (point1 >= 90) {
            grade1 ="A";
        } else if(point1>=80){
                grade1 ="B";

        }else if(point1>=70){
                grade1 ="C";

        }else if(point1>=60){
                grade1 = "D";

        }else if(point1>60){
                grade1 ="F";}

        if(point1%10>=5 && point1 >=60 || point1 == 100){
            grade1 += "+";
        }
    System.out.println(name1 + "학생의 점수는" +grade1 +" 학점 입니다. ");
        }


}
