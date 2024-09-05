package com.ohgiraffers.section02.copy;

public class Application2 {
    public static void main(String[] args) {

        /*수업목표 얕은 복사를 활용해서 매개 변수와 리턴값으로 활용할 수 있다.*/

        /*필기
         * 얕은 복사의 활용
         * 얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
         * 리턴 값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
         *  */

        String[] names = {"푸바오", "러바오", "아이바오", "꿔바로오"};

        //얕은 복사 확인을 위한 hashcode()구문
        System.out.println("names 배열의 hashcode() : " + names.hashCode());

        //우리가 만든 배열을 출력하는 기능을 가진 메소드에 전달
        //우리가 값을 보내면 --> 받는 곳도 값을 담을 준비를 해야되다.

        /*목차 1 인자와 매개변수로 활용하는 얕은 복사*/
        print(names);

        /*목차 2 리턴값의 활용*/
        String[]animals =gatAnimals();

        System.out.println("리턴 받은 animals 의 hashcode() : " + animals.hashCode());

        print(animals);

    }

    //필기. print() 메소드의 역할은 우리가 전달한 배열을 출력하는 역할이다.
    public static void print(String[] baoFamily) {

        System.out.println("baoFamily 의 hashcode() : " + baoFamily.hashCode());
        System.out.println();
        for (int i = 0; i < baoFamily.length; i++) {
            System.out.print(baoFamily[i] + " ");
        }
        System.out.println();

    }



    public static String[]gatAnimals(){

        String[] animails ={"후이바오","루이바오"};

        System.out.println();
        System.out.println("새로만든 animails 의 hashode() : " + animails.hashCode());


        return animails;
    }




}
