package com.ohgiraffers.section01.mathod;

public class Application5 {
    public static void main(String[] args) {
        /* 수업목표 메소드 리턴에 대해서 이해할 수 있다.*/
        /*필기
        * return 이란?
        * 모든 메소드 내부에는 return; 이 존재한다.
        * void 형의 메소드는 return; 을 명시적으로 작성하지 않아도
        * 마지막 줄에 컴파일러가 자동으로 추가를 해준다.
        * return 은 현재 메소드를 강제 종료하고
        * 호출한 구문으로 돌아가는 명령이다.<-- **중요** */

        System.out.println("main 시작!");

        Application5 app3 = new Application5();
        app3.testMethod();


        System.out.println("main 종료!");


    }
    public void testMethod() {
        System.out.println("testMethod() 호오출");
        System.out.println("testMethod() 끄으읕");
        return; // 회색 안 써도 되는거 or 쓰고 있지 않는 거

        /*필기
        * return 키워드는 컴파일러에 의해 자동으로
        * 가장 마지막 줄에 추가된다.
        * 만약 가장 마지막 줄에 쓰지 않게 되면
        * 도달할 수 없는 코드가 되어 컴파일 에러를 발생 시킨다.
        * */

//        System.out.println("끝났어?"); // 도달할수 없는


    }


}
