package com.ohgiraffers.section02.extend;

public class WildCardFarm {
    /*필기
     * 와일드카드(WildCard)
     * 제네릭 클래스 타입의 객체를 메소드의 매개변수를 받을때
     * 그 객체의 탑입 변수를 제한할 수 있다.
     * < ? > : 제한 없음.(다 가능)
     *
     * < ? extends Type > : 와일드카드 상한 제한
     * (Type 과 Type 의 후손을 이용한 인스턴스만 인자로 사용 가능)
     *
     * < ? super Type > : 와일드카드 하한 제한()
     * (Type 과 Type 의 부모를 이용한 인스턴스만 인자로 사용 가능)
     * */

    /*RabbitFarm<> */
    public void anyType(RabbitFarm<?>farm){
        farm.getAnimal().cry();
    }

    public void extendsType(RabbitFarm<? extends Bunny>farm){
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny>farm){
        farm.getAnimal().cry();
    }
}
