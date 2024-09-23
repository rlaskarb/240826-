package com.ohgiraffers.section2.userexception;

import com.ohgiraffers.section1.exception.ExceptionTest;
import com.ohgiraffers.section2.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section2.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section2.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {
        /*title 사용자 정의의 예외 클래스 정의 후 발생한 예외를 처리할 수 있다.*/

        ExceptionTest2 et = new ExceptionTest2();

        try {
            // 상품 가격 음수
//            et.catchEnoughMoney(-3000,5000);
            // 가진 돈이 음수
//            et.catchEnoughMoney(3000,-5000);
            //물건의 가격이 가진돈보다 큼
//            et.catchEnoughMoney(10000,5000);
            // 정상
            et.catchEnoughMoney(10000,5000);


        } catch (Exception e) {

            throw new RuntimeException(e);


        }
    }
}
