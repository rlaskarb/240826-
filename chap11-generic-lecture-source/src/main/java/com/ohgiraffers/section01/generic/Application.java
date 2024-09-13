package com.ohgiraffers.section01.generic;

public class Application {
    public static void main(String[] args) {

        /* 학습목표 제네릭(generic)에 대해 이해 할수 있다.*/
        /*필기
        * 제네릭(generic)의 사전적 의미는 일반적인 이라는 의미를 갖는다
        * 자바에서 제네릭이란(generic)데이터의 타입을 일반화 한다는 의미를
        * 갖게된다.
        *
        * 필기
        * 제네릭은(generic) 클래스나 메소드에서 사용할 내부 데이터 타입을
        * 컴파일 시점에 지정하는 방법을 말한다.
        * 컴파일 시에 미리 타입 검사를 실행하게 되면 클래스나 메소드
        * 내부에서 사용되는 객체의 타입 안정성을 높일 수 있으며,
        * 반환값에 대한 타입 변환 및 타입 검사에 대한 코드 생략이 가능하다.
        * */

        GenericTest<Integer> gt1 = new GenericTest<Integer>();
        gt1.setValue(10);// = gt1.serValue(new Integer 10); 생략되어도 샵가능함.
        System.out.println("gt1.getValue() = " + gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);

        System.out.println("==============================");
        GenericTest<String> gt2 = new GenericTest<String>();
        gt2.setValue("홍길동");
        System.out.println("gt2.getValue() = " + gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

        /*필기
        * JDK 7버전부터 타입 선언 시 타입변수를 작성하면
        * 생성자 쪽에서는 타입을 생략을 해도 된다.*/








    }
}
