package com.ohgiraffers.section02.abstractclass;

public abstract class Product {
    /*추상클래스는 필드를 가질 수 있다.*/
    private int nonStaticField;
    private static int staticField;

    //생성자를 가질 수 있다
    public Product(){}

    public void nonStaticMethod(){
        System.out.println("Product 머시기 머시기 !!!");

    }
    public static void staticMethod(){
        System.out.println("Product 거시기 거시기 ????");

    }

    /*필기
    * 위에까지는 일반적인 클래스와는 다를 바가 없다
    * 하지만 클래스를 수상클래스로 만들게 되면 추상 메소드를 작성할 수 있다.
    * 미완성 메소드(추상 메소드) : 구현부가 없는 메소드를 의미한다.
    * 추상메소드가 0개 이상인 경우 선택으로 abstract 키워드를 클래스 에
    * 작성을 행한다.
    * 하지만 ㅡ 추상 메소드가 존재하면 즉 1개 이상이면 abstract 키워드는 필수*/
    public abstract void absMethod();
}
