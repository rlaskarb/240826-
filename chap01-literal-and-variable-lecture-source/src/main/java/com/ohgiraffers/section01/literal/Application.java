package com.ohgiraffers.section01.literal;

public class Application {
    public static void main(String[] args) {

        // 메인 메소드 안에서 프로그램 동작 시킬 수 있다.

        /* 수업목표. 여러가지 값의 형태를 출력할 수 있다. */

        /* 필기.
        * Java 라고 하는 프로그래밍 언어에서
        * 정해진 약속된 형태의 값들이 있다. */

        /* 목차. 1. 숫자 형태의 값 */
        // 1-1. 정수 형태의 값 출력
        System.out.println(123 + " ← 정수");

        // 1-2. 실수 형태의 값
        System.out.println(1.23 + " ← 실수");

        /* 목차. 2. 문자 형태의 값 */
        // 문자 형태의 값은 홀따옴표 (single-quotation)으로 감싸야 한다.
        System.out.println('a' + " ← 문자 하나");

        //두 개 이상의 문자를 ''에 입력하면?
//        System.out.println('ab');  ← 당연히 안 된다~

        // 두개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
//        System.out.println('');
        // 아무런 문자도 기록되지 않는 경우도 에러가 발생한다.

        System.out.println('3' + " ← 문자로 인식"); // 숫자 값이지만, 홀따옴표로 감사진 경우에는 문자 '3'으로 인식한다.

        /* 목차. 3. 문자열 형태의 값 */
        System.out.println("안녕하세요"); // 문자열은 문자 여려개가 나열된 형태를 의미하며, 쌍따옴표(double-quotation)으로 감싸야 한다.
        System.out.println("123");
        System.out.println(""); // 아무 값도 없는 빈 쌍따옴표도 문자열로 취급을 한다.
        System.out.println("a"); // 한 개의 문자도 쌍따옴표로 감싸면 문자열이다.

        /* 목차. 4. 문자열 형태의 값 */
        System.out.println(true); // ← 주황색 글자 = 예약어
        System.out.println(false); //

    }
}
