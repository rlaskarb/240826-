package com.ohgiraffers.section03.wrapper;

public class Appilcation3 {
    public static void main(String[] args) {

        /*학습목표 기본자료형 값을 문자열로 변경할 수 있다.*/

        /*필기
        * valueOf() : 기본 자려횽 값을 Wrapper 클래스 타입으로 변환
        * toSting() : 필드 값을 문자열로 반환하는 메소드
        * 문자열 합치기
        *  */

        String b = Byte.valueOf((byte) 1).toString();

        /*필기 String 클래스에서 제공하는  valueOf()를 사용할수 있따.*/
        String.valueOf(7);


        /*필기
        * 문자열 합치기를 이용해서 String 타입으로 변환할 수 있다.*/
        String str2 = 123+""; // 문자열이 짱이다. (공백도 문자열)



    }
}
