package com.ohgiraffers.Exercise;

import java.util.Scanner;

public class Calculrator{

    public void calculrator(){

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int first = sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("연산기호 : + , - , * , / , % ");
        System.out.print("연산기호를 입력하세요 : ");
        char ch = sc.next().charAt(0);
        System.out.println();
        System.out.println();
        System.out.print("두번째 정수를 입력하세요 : ");
        int second = sc.nextInt();




        int result = 0;

        switch(ch){
            case '+' :
                plusMethod(first,second);
                break;
            case '-' :
                minusMethod(first,second);
                break;
            case '*' :
                multiplicationMethod(first,second);
                if(first==0 || second==0)
                    try{ throw new MultipleNotZeroException("곱하는 수는 0이 될수 없습니다.");
                } catch (MultipleNotZeroException e) {
                        throw new RuntimeException(e);
                    }
                break;
            case '/' :
                divisionMethod(first,second);
                if(first==0 || second ==0)
                    try{ throw new DivideNotZeroException("나눌 수는 0이 될수 습니다.");
                    } catch (DivideNotZeroException e) {
                        throw new RuntimeException(e);
                    }
                break;
            case '%' :
                shareMethod(first,second);
                try{ throw new DivideNotZeroException("나눌 수는 0이 될수 습니다.");
                } catch (DivideNotZeroException e) {
                    throw new RuntimeException(e);
                }
            default:
                System.out.println("홈버튼 눌러서 계산기 클릭합니다.!!!!");
                return;
        }

    }
    public void plusMethod (int a ,int b){
        System.out.println(a+ " + " + b + "= " + ( a + b ));
    }

    public void minusMethod(int a, int b){
        System.out.println( a - b );
    }
    public void multiplicationMethod(int a,int b){
        System.out.println( a * b );
    }
    public void divisionMethod(int a, int b){
        System.out.println( a / b );
    }
    public void shareMethod(int a , int b){
        System.out.println( a % b );
    }

}
