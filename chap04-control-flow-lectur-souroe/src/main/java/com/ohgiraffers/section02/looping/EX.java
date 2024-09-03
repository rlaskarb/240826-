package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class EX {

    public void Ex1(){
        int sum =0;

        for(int i= 1;i<=10;i++){
            sum += i;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }

    public void Ex2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i =1; i<=num; i++){
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합 :" + sum);
    }

    public void Ex3(){
        Scanner sc =new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=num; i++){
            if()
        }
    }


}
