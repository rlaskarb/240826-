package com.ohgiraffes.section05.parameter;

public class Appilcation1 {
    public static void main(String[] args) {
        /* 학습 목표 메소드의 파라미터에 대해 이해할 수 있다.*/

        /*필기
        * 매개변수(parameter) 로 사용 가능한 자료형
        * 1. 기본자료형
        * 2. 기본자료형 배열
        * 3. 클래스 자료형
        * 4. 클래스 자료형 배열
        * 5. 가변인자
        * */

        parameterTest pt = new parameterTest();

        /*목차 1.기본 자료형 매개 변수 전달*/
        int num = 20;
        pt.testPrimaryParameter(num);

        /*목차 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 */

        int[] iarr ={1,2,3,4,5,};
        System.out.println("인자로 전달하는 값 = " + iarr);

        pt.testPrimaryArrayParameter(iarr);

        System.out.print("메소드 전달 후 원본 배열의 값 확인 : ");
        for(int i = 0; i<iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();


        /*목차 3.클래스 자료형 자료형 매개 변수 전달.*/
        RectAngle r1 = new RectAngle(12.5,22.5);

        System.out.println("인자로 전달하는 클래스 자료형 값 : " + r1 );
        pt.testClassParameter(r1);


        /*목차 5 가변인자.*/
        /*필기
        가변인자: 인자로 전달하는 값의 갯수가
                정해지지 않느 경우 사용하는 배열이다.

        가변인자는 매개변수가 여러 개 일 때 반드시 뒤에 작성해야 한다.
        why? -> 가변인자의 끝을 알수 없기 때문에.
        */
        pt.testVariableLengthParameter("김남규!"); // 가변인자는 전달하지 않아도 된다.
        pt.testVariableLengthParameter("김남규","술래잡기","고무줄놀이","말뚝밖기","마빡이");
        pt.testVariableLengthParameter("김남규",new String[]{"테니스","야구","농구","배구"});




    }


}
