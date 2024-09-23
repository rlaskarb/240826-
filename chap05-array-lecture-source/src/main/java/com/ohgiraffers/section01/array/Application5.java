package com.ohgiraffers.section01.array;

public class Application5 {
    public static void main(String[] args) {
        /*학습목표 배열을 사용한 예제(2) */

        /* 문제. 랜덤한 카드 한 장을 뽑아서 출력*/
        /* 필기. 트럼프 카드의 숫자와 / 카드의 문양 배열을 만들것이다.*/

        String[] shapes ={"SPADE" , "CLOVER" , "HEART" , "DIANOND"};
        String[] cardNumber = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "JACK", "QUEEN" , "KING" , "ACE"};

        //(Math.random() * 범위) + 최소값
        int randomShapesIndex = (int) (Math.random() *shapes.length);
        int randomCardNumberIndex =(int) (Math.random()*cardNumber.length);

        /* 필기  발생한 난수를 index 에 대입햐서 출력 */

        System.out.println("당신이 뽑은 카드는 : " + shapes[randomShapesIndex] + " " + cardNumber[randomCardNumberIndex] + " 카드 입니다.");




        String[] eatery ={"돈까스" , "설렁탕" , "스파게티" , "중국집"};

        //(Math.random() * 범위) + 최소값
        int eateryIndex = (int) (Math.random() *eatery.length);

        System.out.println("오늘 점심 메뉴는 : " + eatery[eateryIndex] + " 입니다. ");





    }

}
