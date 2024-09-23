package com.ohgiraffers.section04.overflow;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 오버프롤우에 대해 이해할 수 있다. */

        /*필기
        * 자료형별 최대 범위를 벗어나는 경우를 오버플로우 라고 한다.*/

        /*목차 1. 오버플로우 */
        byte num1 = 127;

        System.out.println("num1 =" + num1); // 127 : byte 의 최대 저장 범위

        num1++;       // num1 + 1; 1증가

        System.out.println("num1 overflow 확인하기 : " + num1);

        /*목자 2. 언더플로우*/
        byte num2 = -128;

        System.out.println("num2 = " + num2);

        num2--;     // num2 -1과 같은의미, 1감소

        System.out.println("num2 underflow 확인하기 : " + num2);

        /* 오버플로우랑 언더플로우가 발생 했어나,컴파일에러나 런타임 에러가 발생하지 않았다.
        *  그렇기 때문에 최대값 혹은 최소값의 범위를 고려해서 코드를 작성해야
        *  한다는 의미이다. */

        int firstNum = 1000000; // didtn 21억 정도까지 저장이 가능하다.
        int secondNum = 700000;

        int multi = firstNum * secondNum;
        System.out.println("multi = " + multi);

        long longMulti = firstNum * secondNum;
        long result = (long) firstNum * secondNum;
        /*이미 오버플로우 된 값을 longMulti에 담은 것 뿐.
        * 계선처리 전에 미리 long 타입을 자료형을 변경해야한다.*/


        /*요상한 값이 나왔다
        * 이미 오버플로우 된 값을 저장한 것 뿐이기 때운에
        * 계산 처리 전에 미리 long 타입을 자료형을 변경해야 한다. */


//        long longMulti = ("longMulti = " + longMulti);


//        long result = (long) firstNum * secondNum;
        // 강제 형변환을 이용한 결과값 출려해보기. 다음 section 에서 나옵니다.
        System.out.println("result = " + result);




    }



}
