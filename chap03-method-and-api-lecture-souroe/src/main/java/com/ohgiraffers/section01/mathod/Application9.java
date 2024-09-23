package com.ohgiraffers.section01.mathod;

public class Application9 {
    public static void main(String[] args) {

        /*다른 클래스에 작성한 메소드를 호출 할 수 있다.*/
        /*필기
         * 우리는 Application 에서 2개의 정수를 전달 할 것이고
         * Calculator 클래스는 2개의 정수를 전달 받아
         * 최소값을 구하는 메소드(기능)
         * 최대값을 구하는 메소드(기능)
         *실행 후 Application 에게 2개의 정수 중 큰 값고 장은 값이
         * 무엇인 지 알려 줄것이다
         *  */
        int first =10;
        int second =8;

        /*필기 non-static method 호출방식*/
        Calculator calc = new Calculator();
        int min =calc.minNumberof(first,second);

        /*필기 static method 호출방식 */
        int max =Calculator.maxNumberof(first,second);

//        /* static 메소드도 non-static 메소드 처럼 호출은 가능하다.
//        * 하지만 권장하지 않는다. why? -> 원래 방식이 있는데 굳이 왜 하냐?
//        * new 키워드로 접근을 하게된다면 공유된 값에 예상치 못 한 동작을
//        * 유발할 수 있기 때문에 사용을 제한해달라는 컴퓨터의 주의 문구 이다.*/
//        int max2 =calc.maxNumberof(first,second);



        System.out.println("min = " + min);

        System.out.println("max = " + max);


    }
}
