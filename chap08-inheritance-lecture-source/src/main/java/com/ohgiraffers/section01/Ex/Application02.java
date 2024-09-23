package com.ohgiraffers.section01.Ex;

import com.ohgiraffers.section01.extend.Car;
import com.ohgiraffers.section01.extend.FireCar;

public class Application02 {
    public static void main(String[] args) {

        //상송에 대해 이해 할수 있다
        /*필기
        * 상속은 현실세계의 상속과 비슷한 개념이다.
        * 부보가 가지고 있는 멤버(필드,메서드)를 자식이 물려 받는 의미를 가지고 있다
        * 클래스 또한 부모 클래스와 자식 클래스로 나뉘어 부모가 가지는 멤버를 자식이
        * 물려받아 마치 자신의 것처럼 사용하는것을 의미한다.
        *
        * /*필기
        단순히 부모의 것을 사용하는 것 뿐만 아니라,
        물려받는 멤버를 확장하거나 추가적인 멤버를 작성하는 것도 가능하다.
        특히 메소드 재정의 (overriding) 라는 기술을 통해
        *부모가 가진 메소드를 자식이 다시 정의하는 것이 가능하다.
         */

        /*필기
        * Overriding 이란
        * 메소드를 재정의
        * 부모가 가지는 메소드 대로 동작할 수 있도록
        * 구현 몸체(영역)을 새롭게 다시 작성을 한 것이다.
        * 메소드를 재 정의있게 한다면 재정의한 메소드가 우선 작동을 한다.
        * */

        /*필기
        * 이렇게 우리가 상속이라고 하는 기술을 사용하게 되면 얻는 장점
        * 1. 새로운 클래스를 작성할 시 기존에 작성한 클래스를 재사용
        *   1-1 재사용 시 생산선을 크게 향상시 시킬수 있다,(세롭게 작성 안 해도 됨)
        *   1-2 공통적으로 사명하는 코드가 부모클래스에게 존재 되면
        *       수정사항이 생길 시 부모클래스만 수정을 해도 구체적으로 사용가능(유지보수성)
        * 2. 클래스 간의 계층 관리가 생기며 다형성 문법의 토대가 된다.
        *
        *
        * 필기
        * 하지만 상속으로 단점 존재
        * 1.부모클래스의 기능을 추가/변경 할시 자식 클래스가 정상적으로 자동하는지 예측어려움
        * 상속 구조가 복잡해 질 수록 그 영향에 대한 예측이 힘들어지며
        * 이렇한 복작합 구조는 오히려 유지 보수성을 악화 시킬수 있다.
        *
        * 2.또한 부모 클래스의 변경이 쉽지 않다.
        * 자식클래스에서 중요하게 사용하는 부모 메소드를 수정할 시
          자식 클래스에 모두 영향을 미칠수 있다.
        *
        *
        * 3.부모 클래레스에서는 의미 있는 기능이 자식에선 의미가 무의미 수 있다.
        */

        /*목차 1. Car 인스턴스 생성 후 메소드 호출*/

        Car1 car1 = new Car1();
        car1.soundHorn();
        car1.run();
        car1.soundHorn();
        car1.stop();
        car1.soundHorn();
        System.out.println("======================");

        /*목차 2. FireCar 인스턴스 생성 */
        FireCar1 fireCar1 = new FireCar1();
        fireCar1.soundHorn();
        fireCar1.run();
        fireCar1.soundHorn();
        fireCar1.stop();
        fireCar1.soundHorn();

        /*상속은 물려받은 것 뿐만 아니라 확장도 할수 있다.*/

        fireCar1.speatWater();

        System.out.println("**************************");

        /*경적이 없는 차를 만들어 보기 */
        FarmCar1 farmCar1 = new FarmCar1();
        farmCar1.soundHorn();
        farmCar1.run();
        farmCar1.soundHorn();
        farmCar1.stop();
        farmCar1.soundHorn();




    }
}
