package com.ohgiraffers.section01.mathod;

public class Application2 {

    public static void main(String[] args) {

        /* 학습목표 다른 흐름의 메소드 호출에 대해 이해할 수 있다. */

        /* 목차 1. mathodA(), mathodB(), mathodC() 차례로 작성 */
        /* 목자 2. 작성후 메소드 호출 확인과 실행 종료 출력 구문을 작성 */
        /* 목차 3. 메인메소드 실행 종료를 확인하기 위한 출력 구문을 작성 */
        System.out.println("main() 자 이제 시작~");


        /*목차 4. mathodA(), mathodB(), mathodC() 차례로 호출을 해보자.*/

        // 클래스명 변수명 = new 클래스명();
        // 변수명,메소드명();


        Application2 app2 = new Application2();
        app2.mathodA();
        app2.mathodB();
        app2.mathodC();


        System.out.println("main() 우리가 이제 헤어져야 할시간 다음에 또 만나요~");

    }

    public void mathodA() {

        System.out.println("mathodA 호출됨..");


        System.out.println("mathodA 종료됨..");


    }

    public void mathodB() {
        System.out.println("mathodB 등장..");


        System.out.println("mathodB 사라짐");


    }

    public void mathodC() {
        System.out.println("mathodC 뾰로롱~..");


        System.out.println("mathodC 스르륵~..");



    }














}
