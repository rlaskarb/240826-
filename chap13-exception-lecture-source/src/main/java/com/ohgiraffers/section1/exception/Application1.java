package com.ohgiraffers.section1.exception;

public class Application1 {
    public static void main(String[] args) throws Exception {
        /*title . 예외에 대해 이해하고 이를 처리하기 위한 문법 이용*/

        /*comment
        * 예외처리
        * 프로그램 작성시 문법에 맞지 않는 경우에는 코드를 컴파일(번역)
        * 시에 컴파일 에러를 발생시킨다.
        * 또한 자바 문번에 맞게 작성하여 컴파일 오루가 발생하지 않더라도
        * 실행 시에 예상치 못 한 오류가 발생할 수 있다.
        * 컴퓨터 프로그램이 작동하는 도중에 예상치 못한 상황이 발생하여
        * 영향을 받는 것을 오류 (Error) 와 예외 (Exception) 두가지로
        * 구분할 수 있다.
        * */

        /*comment
        * Error
        * 시스템 상에서 프로그램에 심각한 문제를 발생하여 종료되는 것을 의미
        * 개발자가 예측하여 처리하는 것이 불가능 하며, 오류에 대한 처리를 할수 없다.
        *
        * Exception
        * 오류와 마찬가지로 실행중인 프로그램을 비정상적으로 종료시키지만,
        * 발생할 수있는 상황을 예측하여 처리할 수 있는 미약한 오류를 의미한다.
        * 개발자는 이러한 예외에 대해 상황을 적절히 처리하여 코드의 흐름을
        * 컨드롤 할 수 있다.
        * */

        /*comment
        * 강제로 예외 발생
        * -throw new 예외 클래스명();
        * 예외처리방법
        * 1. throw 로 호출한 쪽으로 위임
        * 2. try- catch 구문으로 처리
        * */


        /*index 1. throw 위임 */

        ExceptionTest et = new ExceptionTest();

        /*comment 예제!
        * 상품을 사야하는데 상품 가격은 30,000원 이고
        * 내가 가진 돈이  50,000원 인 경우,
        * 반대로 내가 가진 돈이 10,000원 인 경우*/

        /*comment
        * check 메소드에서 throw 를 했더니 호출한 Application 에서
        * 오류가 발생하고 있다.
        * 그렇다는 것은 throws 는 자신을 호출한 곳에서 예외를 처리하라고
        * 강제화를 걸었다는 것이다.*/

        // 상품 10000원 , 가진돈 50000원
        et.checkEnoughMoney(10000,50000);

        et.checkEnoughMoney(50000,10000);


        System.out.println("프로그램 종료");

    }
}
