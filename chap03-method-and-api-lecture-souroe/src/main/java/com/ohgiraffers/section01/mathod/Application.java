package com.ohgiraffers.section01.mathod;

public class Application {
    public static void main(String[] args) {

        /*수업목표 메소드의 호출 흐름에 대해 이해할 수 있다.*/
        /*필기
        * 메소드 란?
        * 메소드(method) 는 어떤 특정 작업을 수행하기 위한
        * 명령문(코드)의 집합.
        * */

        System.out.println("main() 시작됨...");


        /*목차 2 작성한 methodA() 호출하기. */
        /*필기
         * 우리가 만든 메소드 호출하는 방법.
         * [표현식]
         * 클래스명 변수명 = mew 클래스명();
         * 변수명.메소드명();
         * */

        /*필기
        * main 영역 밖에 있는 친구를 소환할 때 쓰는 구문
        * */

        Application app1 = new Application();
        app1.methodA();



        System.out.println("main() 종료됨...");


    }

    /*목차 1 methoda() 만들어보기 */
    public void methodA() {

        System.out.println("mathodA() 등장....");

        methodB();

        System.out.println("methodA() 퇴장....");


    }

    public void methodB() {

        System.out.println("matshodB() 두둥등장...");

        System.out.println("matshodB() 퇴장한다...");

    }




}
