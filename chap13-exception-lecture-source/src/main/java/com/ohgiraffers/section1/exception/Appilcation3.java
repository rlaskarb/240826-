package com.ohgiraffers.section1.exception;

public class Appilcation3 {
    public static void main(String[] args) {

        /*title try-catch 블럭을 이용하여 예외처리를 할 수 있다.*/

        /*index 3. try-catch 블럭을 이용한 방법 (예외 발생) */
        ExceptionTest et =new ExceptionTest();


        try {
            //상품의 가격이 더 높게 만들 것 이다.
            et.checkEnoughMoney(50000,10000);

            System.out.println("======상품 구입 가능======");

        } catch (Exception e) {
            System.out.println("======상 품 구 입 불 가 능======");
        }
        System.out.println("프로그램 종료!");

    }
}
