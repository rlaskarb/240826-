package com.ohgiraffes.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {


        /*학습목표. 필드에 직접 접근 시 발생하는 문제(3) */

        // 여기서는 problem1 을 적용 -> 메소드를 통해 값 입력
        Monster monster1 = new Monster();
        monster1.setName("루피");
        monster1.setHp(10000);

        Monster monster2 = new Monster();
        monster2.setName("조로");
        monster2.setHp(7000);


        Monster monster3 = new Monster();
        monster3.setName("상디");
        monster3.setHp(7000);

        Monster monster4 = new Monster();
        monster4.setName("우솝");
        monster4.setHp(100);


        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
        System.out.println(monster4.getInfo());

        /*학습목표 뭔가 해결된 것 같지만 아직 해결되지 않은 게 있다.*/
        Monster monster5 = new Monster();
        monster5.kinds = " ";
        monster5.hp = -123123132;
        // 필기 . 아직도 필드에 직접 값을 넣을 수 있따.



    }
}
