package com.ohgiraffers.section05.lofical;

public class Application {
    public static void main(String[] args) {

        /*필기
        * 1논리연결 연산자
        * -두 개의 피연산자를 가지는 이항 연산자 이며, 두 두개의 논리 식을 판단하여
        * -참과 거짓을 판단해준다.
        * 1-1 &&(논리 AND) 연산자
        * -두개의 논리식 모두 참일 경우 참을 반환, 둘 중 하나라도 거짓이면 거짓이다.
        * 1-2 ||(논리 OR) 연산자
        * -두개의 논리식 둘중 하나라도 참일 경우 참을 반환, 둘다 거짓이면 거짓이다.
        * 2 논리 부정 연산자
        * -피연산자가 하나인 단항 연산자
        *  2-1 !(논리 NOT) 연산자
        *  - 논리식의 결과가 참이면 거짓, 거짓이면 참을 반환한다.
        *  -(식을 반전? 시킨다.)*/

        /*목차 1논리연산자의 결과값 확인*/
        System.out.println("true 와 true 의 논리 and 연산 : " + (true && true));
        System.out.println("true 와 false 의 논리 and 연산 : " + (true && false));
        System.out.println("false 와 true 의 논리 and 연산 : " + (false && true));
        System.out.println("false 와 false 의 논리 and 연산 : " + (false && false));

        System.out.println("====================================================");


        System.out.println("true 와 true 의 논리 or 연산 : " + (true || true));
        System.out.println("true 와 false 의 논리 or 연산 : " + (true || false));
        System.out.println("false 와 true 의 논리 or 연산 : " + (false || true));
        System.out.println("false 와 false 의 논리 or 연산 : " + (false || false));

        System.out.println("====================================================");
        System.out.println("true 의 논리 not 연산 : " + (!true));

        System.out.println("====================================================");

        /*목차 2 논리식에 논리연산자 활용해보기 */

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("a 가 b 보다 작으면서 c 가 d 보다 작은 지 확인 : " + (a < b && c < d ));
        System.out.println("a 가 b 보다 작으면서 c 가 d 보다 큰 지 확인 : " + (a < b && c > d ));
        System.out.println("a 가 b 보다 크면서 c 가 d 보다 작은 지 확인 : " + (a > b && c < d ));
        System.out.println("a 가 b 보다 크면서 c 가 d 보다 큰 지 확인 : " + (a > b && c > d ));

        System.out.println("====================================================");

        System.out.println("a 가 b 보다 작거나 c 가 d 보다 작은 지 확인 : " + (a < b || c < d ));
        System.out.println("a 가 b 보다 작거나 c 가 d 보다 큰 지 확인 : " + (a < b || c > d ));
        System.out.println("a 가 b 보다 크거나 c 가 d 보다 작은 지 확인 : " + (a > b || c < d ));
        System.out.println("a 가 b 보다 크거나 c 가 d 보다 큰 지 확인 : " + (a > b || c > d ));

        System.out.println("====================================================");










    }
}
