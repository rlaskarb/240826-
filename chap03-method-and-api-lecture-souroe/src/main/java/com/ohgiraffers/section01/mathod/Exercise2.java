package com.ohgiraffers.section01.mathod;

public class Exercise2 {
    public static void main(String[] args) {

        /**형 변환 문제**

        정현님의 체중은 55.5kg 이고 키는 160cm입니다.
                BMI를 계산하는 코드를 작성하세요.

                * BMI(체질량지수) = 체중(kg) / (키(m)의 제곱)  ※ 키의 단위 확인
        출력은 정현님의 BMI는 ? 입니다. 로 출력해주세요.*/

        double numKg = 55.5;
        int numCm = 160;

        int bmi = (int)numKg / (numCm * 2);

        System.out.println("정현님의 BMI = " + bmi);




    }
}
