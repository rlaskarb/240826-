package com.ohgiraffers.section04.comparison;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표 비교연산자에 대해 이해하고 활용할 수 있다. */

        /*필기
        * 비교연산자
        * 비교연산자는 피연산자 사이에서 상대적인 크기를 판단하여
        * 참 혹은 거짓을 반환하는 연산자이다.
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는
        * 조건식이나 조건문의 저건절에 많이 사용된다.(충분한 연습 필요)*/

        /*필기
        * 비교연산자의 종류
        * '=='(같냐?) : 왼쪽 피연산자와 오른쪽 피연산자가 같으면 true, 다르면 false
        * '!='(안 같냐?) : 왼쪽 피연산자와 오른쪽 피연산자가 다르면 true, 같으면 false
        * - ! -> 부정이다.
        * '>' : 왼쪽이 피연산자가 오른쪽 피연산자 보다 크면 true, 다르면 false
        * '>=' : 왼쪽이 피연산자가 오른쪽 피연산자 보다 크거나 같으면 true, 다르면 false
        * '<'
        * '<='
        * */

        /*목차 1 숫자값 비교*/
        int num1 = 10;
        int num2 = 20;

        System.out.println("============= 정수값 비교=============");
        System.out.println("num1 과 num2 가 같은 지 비교 : " + (num1 == num2));
        System.out.println("num1 과 num2 가 같은 않은지 비교 : " + (num1 != num2));
        System.out.println("num1 이 num2 보다 큰 지 비교 : " + (num1 > num2));
        System.out.println("num1 이 num2 보다 작은 지 비교 : " + (num1 < num2));
        System.out.println("num1 이 num2 보다 크거나 같은 지 비교 : " + (num1 >= num2));
        System.out.println("num1 이 num2 보다 작거나 같은 지 비교 : " + (num1 <= num2));

        System.out.println("=======================================================");

        /*목차 2 문자 값 비교*/
        char ch1 = 'a';
        char ch2 = 'A';

        // == != 이건 가능하지 않을까?
        // > , < 이것도 가능하지 않을까?
        // 필기. 문자는 내부적으로 숫자로 처리가 되기 때문에 대소비교가 가능하다.

        System.out.println("ch1 > ch2 : " + (ch1 > ch2));
        System.out.println("ch1 < ch2 : " + (ch1 < ch2));

        /*목차 3 문자열 값 비교*/
        String str1 = "김남규";
        String str2 = "김남규";

        System.out.println("=============문자열 값 비교=============");
        System.out.println("str1 과 str2 가 같은지 비교 : " + (str1 == str2));
        System.out.println("str1 과 str2 가 다른지 비교 : " + (str1 != str2));
//        System.out.println("str1 이 str2 과 작거나 같은지 비교 : " + (str1 >= str2));




    }
}
