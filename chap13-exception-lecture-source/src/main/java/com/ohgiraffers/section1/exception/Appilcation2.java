package com.ohgiraffers.section1.exception;

public class Appilcation2 {
    public static void main(String[] args) {

        /*title try-catch 블럭을 이용하여 예외처리를 할 수 있다.*/

        /*index 2. try-catch 블럭을 이용한 방법(예외 발생하지 않음) */
        ExceptionTest et =new ExceptionTest();

        //try 구문 내에서 예외가 발생하면 catch 구문이 동작을 한다.
        try {
            et.checkEnoughMoney(10000,50000);

            System.out.println("======상품 구입 가능======");

        } catch (Exception e) {
            System.out.println("======상 품 구 입 불 가 능======");
        }
        System.out.println("프로그램 종료!");



    }
}
