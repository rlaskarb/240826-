package com.greedy.level02.normal;

import java.util.Scanner;

public class RandomMaker {
    public static void main(String[] args) {

        /*최소값부터 최대값 까지 범위의 난수 반환함*/

        Scanner sc = new Scanner(System.in);

        System.out.print("최소값 : ");
        int randomNumberMin = sc.nextInt();

        System.out.print("최대값 : ");
        int randomNumberMax = sc.nextInt();

        System.out.println("랜덤 값 : " + (int) ((Math.random() * ((randomNumberMax - randomNumberMin) + 1))) + randomNumberMin);



        /*인자의 길이 만큼의 랜덤한 대문자 알파벳으로 이루어진 문자열을 반환함*/
//        randomUpperAlphabet(lenght:int) :String

        RandomMaker maker = new RandomMaker();

//        maker.circlePerimeter(double result);

//        System.out.println("원의 넓이는 :" + result +"이다");

        RandomMaker mker = new RandomMaker();
        double v = (int) mker.circlePerimeter(3,Math.PI);

        System.out.println("원의 둘레는 : " + v + "이다" );


        double h = mker.circleHeight(3 , Math.PI);
        System.out.println("원의 둘레는 : " + h + "이다");



    }

    public double circlePerimeter(double radius , final double PI){

        double result = PI * (radius * 2);

        return result;

    }
 public double circleHeight (double radius , final double PI){
        return radius *2 * PI;
 }

}
