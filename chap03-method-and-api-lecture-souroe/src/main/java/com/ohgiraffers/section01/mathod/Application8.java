package com.ohgiraffers.section01.mathod;

public class Application8 {
    public static void main(String[] args) {

        /*학습목표 static 메소드를 호출 할 수 있다.*/
        /*필기
        * 우리가 지금 만들고 있는 메소드는 public 과 void or 자료형 사이에
        * static 키워드가 붙은 메소드를 만들어서 호출을 해 볼 것이다.
        * static 나중에 다시 다룰거지만,
        * static 키워드가 붙은 메소드 호출을 알아 볼 것이다.
        * */
        /*필기
        * [표현식]
        * 클레스명.메소드명(); <- 이런 방식으로 호출한다.
        * */

        Application8.sumTowNubers(10,20);

        int result = sumTowNubers(10,20);

        System.out.println("result :" + result);

        /*필기
        * 동일한 클래스 내에 작성된 static 메소드는 클래스명이
        * 생략 가능하다.*/

        sumTowNubers(10,20);




    }
    public static int sumTowNubers(int first, int second) {
        return first + second;

    }
}
