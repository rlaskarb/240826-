package com.ohgiraffers.section01.mathod;

public class Application3 {

    public static void main(String[] args) {
        /* 수업목표 메소드의 전달인자와 매개변수에 대해 이해하고 활용할 수 있다.*/

        /*필기
        * 전달인자(argument)와 매개변수(parameter)
        * 지금까지 우리가 배운, 즉 사용한 변수는 지역분수에 해당한다.
        *
        * 필기
        * 변수의 종류
        * 1 지역변수
        * 2 매개변수
        * 3 전역변수
        * 4 클래스(static)변수
        *
        * 필기
        * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다.
        * 이것을 지역변수의 스코프(범위) 라고 한다.
        * 이제 만약 다른 메소드를 끼리 값을 공유해야 하는 경우가 생기는 경우
        * 메소드 호출 시에 사용하는 괄호 ex) methodA() 를 이용해서 값을
        * 전달할수 있다.
        * 이 떄 전달하는 값을 전달인자(argument) 라고 부르고,
        * 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를
        * 매개변수(parameter) 라고 부른다.
        * */

        /*목차2 만든 메소드 호출 해보기*/
        Application3 app1 = new Application3();
        app1.testMethod(30);
//        app1.testMethod("40"); // 매개변수 공간은 int 형이지만 인자를 string 으로 보내서 오류 발생
//        app1.testMethod(20 , 30, 40); // 준브 된 공간이 1개 뿐이지만, 인자를 개 보냈기 때문에 오류 발생
//        app1.testMethod(); //매개변수는 선언되어 있지만 인자로 값을 전달하지 않으면 오류 발생

        /*목차 3 변수에 저장한 값을 전달 테스트*/
        int age =20;
        /* 필기 변수에 자장한 값을 전달할 수 있다 */
        app1.testMethod(age);

        /*목차 4 자동 형변환을 이용하여 값 전달 테스트 */
        byte bNum = 10;
        app1.testMethod(bNum);

        /*목차 5 강제 형변환을 이용하여 값 전달 테스트 */
        long lNum = 36;
        app1.testMethod((int)lNum);

        /*목차 6 연산 결과를 이용해서 값 전달 테스트 */
        app1.testMethod(age*3);


    }
    /*목차1 호출 할 메소드 만들기*/
    public void testMethod(int test) {

        System.out.println("testMethod 어서와 여긴처음이지?");

        System.out.println("제 나이는 " + test +" 세 입니다.");

        System.out.println("testMethod 그만 알아보자");




    }


}
