package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product{
    @Override
    public void absMethod() {
        System.out.println("Product 클래스의 오버라이딩 강제화 된 absMethod() 호출!");
    }
    // 상속 복습 : 부모의 것 뿐만 아니라 자기만의 기능을 가질 수 있다.
    public void childMethod(){
        System.out.println("SmartPhone 클래스의 오버라이딩 강제화된 as");
    }
}
