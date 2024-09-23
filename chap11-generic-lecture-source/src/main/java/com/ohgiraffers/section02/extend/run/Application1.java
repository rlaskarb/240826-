package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {

        /*학습 목표 extends 키워드를 사용해서 특정 타입만 사용할 수 있도록 범위를 제한할 수 있다.*/

        //Animal 은 Rabbit 이거나 Rabbit 후손이 아니다.
//        RabbitFarm<Animal>farm1 = new RabbitFarm<Animal>();
        //Mammal 은 Rabbit 이거나 Rabbit 후손이 아니다.
//        RabbitFarm<Mammal>farm2 = new RabbitFarm<Mammal>();

        RabbitFarm<Rabbit> farm3 =new RabbitFarm<Rabbit>();
        RabbitFarm<Bunny> farm4 =new RabbitFarm<Bunny>();
        RabbitFarm<DrunkenBunny> farm5 =new RabbitFarm<DrunkenBunny>();

        farm3.setAnimal(new Rabbit());
        farm3.getAnimal().cry();

        System.out.println("====================");
        farm4.setAnimal(new Bunny());
        farm4.getAnimal().cry();

        System.out.println("====================");
        farm5.setAnimal(new DrunkenBunny());
        farm5.getAnimal().cry();



    }
}
