package com.greedy.level02.normal;


import java.util.Scanner;

public class RandomMaker1 {
    public static void main(String[] args) {
        System.out.println("RandomMaker 게임에 오신 걸 환영합니다.");
        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println("첫 번째 게임은 최소값과 최대값을 지정하면");
        System.out.println("해당하는 범위의 난수를 발생시키게 됩니다.");

        RandomMaker2 rm = new RandomMaker2();
        Scanner sc = new Scanner(System.in);

        System.out.print("난수의 최소값을 지정해주세요 : ");
        int min = sc.nextInt();
        System.out.println("최소값 : " + min);
        System.out.println("=====================================");
        System.out.print("난수의 최대값을 지정해주세요 : ");
        int max = sc.nextInt();
        System.out.println("최대값 : " + max);
        System.out.println("=====================================");

        System.out.println("지정한 범위로 난수를 호출해 드리겠습니다.");

        int random = rm.randomNumber(min,max);
        System.out.println("결과가 나왔습니다.");
        System.out.println("지정한 범위의 난수는 " + random +"  입니다." );


        System.out.println("============================================");

        System.out.println("두번째 게임을 시작 하겠습니다.");
        System.out.println("두번째 게임은 가위,바위,보 중 한 가지를 반환합니다.");
        System.out.println("시작 하겠습니다.");
        String game = rm.rockPaperScissors();
        System.out.println("가위 ~ 바위 ~ 보 : " + game );


        System.out.println("===============================================");

        System.out.println("== 세번째 게임을 시작해 보겠습니다.==");
        System.out.println("== 동정의 앞면, 뒷면 중 한가지를 고르시면 됩니다.");
        System.out.println("== 그럼 시작하겠습니다.==");
        String coinGame = rm.tossCoin();
        System.out.println("동전을 던졌을 떄의 결과는????");
        System.out.println( coinGame + "입니다~!");


        System.out.println("====================================================");
        int a=11;
        int b=-5;
        int c=(a++) - b--;
        int d=++c + a--;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("d : " + d);
        System.out.println("추가연산 : " +(a++- --b + c++));























    }

}