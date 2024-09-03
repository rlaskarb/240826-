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

        for(int i= 2; i<=num; i=i+2){
            sum += i;

        }
        System.out.println("1부터" + num + "까지 짝수의 합 :" + sum);
    }

    public void Ex4(){
        Scanner sc =new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(i + " 번째 : " + ch);
        }
    }

    public void Ex5(){
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.print(i +"번째" + ch);
        }
    }




}
