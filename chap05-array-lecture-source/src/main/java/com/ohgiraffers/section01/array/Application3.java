package com.ohgiraffers.section01.array;

public class Application3 {
    public static void main(String[] args) {

        /*수업목표 배열에 초기화 되는 자료형 별 기본값을 알 수 있다.*/

        /*필기
        * 정수: 0
        * 실수: 0.0
        * 논리: false
        * 문자: |u000(유니코드)
        * 문자열 : null
        * */

        int[] iarr = new int[5];

        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);

//        iarr[0] = 10;
        /*필기
        * 자바에서 지정한 기본값 외의 값으로 초기화를 하고 싶은 경우에는 블럭({})을 이용한다.
        * 블록을 사용하는 경우에는 new 를 사용하지 않아도 되며,
        * 값의 갯수만큼 자동으로 크기가 설정 된다.
        * */

        int[] iarr2 = {11,22,33,44,55};
        //int[] iarr2 = new int[5]
        //iarr2[0] = 11;~~~~~

        // 이런 식으로도 가능하다.
        int[] iarr3 = new int[]{11,22,33,44,55};

        /*문제. 들어있는 값 반복으로 출력해 보기*/
        for(int i =0; i < iarr2.length; i++){
            System.out.println("iarr2[" + i +"] :" + iarr2[i]);
            System.out.println("iarr3[" + i +"] :" + iarr3[i]);
        }

        String[] sarr = {"apple","banana","orange"};

        for(int i = 0; i <sarr.length; i++){
            System.out.println(sarr[i]);

        }


    }
}
