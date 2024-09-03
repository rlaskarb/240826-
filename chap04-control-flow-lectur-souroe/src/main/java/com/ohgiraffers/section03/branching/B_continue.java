package com.ohgiraffers.section03.branching;

public class B_continue {
    public void testContinueStatement(){
        /*수업목표 continue 문은 사용에 대한 흐름을 이해할 수 있다*/

        /*필기
        * continue 문도 break 와 마찬가지로 반복문 내에서 사용한다
        * break 반복문을 탈출 종료 하지만
        * continue 는 중간에 멈추고 다시 증감식으로 넘어가게 된다.
        * 일반적으로 if(조건식) {continue;}처럼 사용된다.
        * 보통 반복문 내에서 특정 조건에 대한 예외 처리할때
        * 사용이 된다.
        * */


        /*목차 1 1부터100 사이의 3의 배수이면서 4의 배수인 값 출력*/

        for(int i = 1; i<101; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.println(i);

            }else{
//                continue;
                break;
            }
        }

    }

    public void testContinueStatement2(){
        /*목차
        * 2~9 단의 구국단을 출력 할 것이다.
        * 단, 수가 5인 경우는 출력하지 않을 것이다.
        *  */

        for(int i=2; i<10; i++){
            for(int su=1; su<10; su++){

                if(su==5){
//                    break;
                    continue;
                }


                System.out.println( i + " * " + su + " = " + (i*su));
            }

            System.out.println();

        }


    }

    public void test1(){
        /*문제
        * 구구단 2~9단을 출력할 것이다.
        * 단, 각 단의 수(su)가 짝수인 경우에는 출력을 생략
        * ex) 2*1 =2 , 2*3=6
        * */

        for(int i=2; i <10; i++){
            for(int su=1; su <10; su++){
                if(su % 2 ==0 ){
                    continue;

                }System.out.println(i + " * " + su + " = " + (i*su));
            }
            System.out.println();
        }

    }

}


