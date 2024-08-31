package com.greedy.level02.normal;

import java.util.Random;
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











    }

}