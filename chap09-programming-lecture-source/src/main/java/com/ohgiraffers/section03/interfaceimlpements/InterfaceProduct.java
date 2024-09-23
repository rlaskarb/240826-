package com.ohgiraffers.section03.interfaceimlpements;

public interface InterfaceProduct {
    int MAX_NUM = 10;

    /*필기
    * 인터페이스는 추상메소드만 작성이 가능하다.
    * 따라서 인터페이스 내부에 작성한 메소드는 묵시적으로
    * public abstract 의 의미를 가지게 된다.
    * 인터페이스는 생성자를 가질 수 없다.
    * */
    /*목차 1. 인터페이스는 생성자를 가질 수 없다.*/
//    public InterfaceProduct(){}

    /*목차 2 Interface 는 구현부가 있는 메소드를 가질 수 없다.*/
//    public void nonstaticMethod(){}

    /*목차 3 추상클래스에서 작성해본 추상메소드만 작성할 수 있다.*/
    /*필기
    * Interface 내부의 메소드는 묵시적으로 public abstract 의 의미를
    * 가지고 있다.
    * 다른 접근제한자는 사용이 불가능하다.
    * */
    public abstract void nonstaticMethod();

    /* static Method 는 작성가능*/
    static void staticMethod(){
        System.out.println("InterProduct 의 staticMethod() 호출!");

    }
}
