package com.ohgiraffers.section03.sort;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표 변수의 두 값을 변경하는 방법*/

        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        /*필기 임시공간을 만들어 보자*/
        int temp;
        temp = num1; // temp 에 10
        num1 = num2;
        num2 = temp;

        System.out.println("수정후 num1 = " + num1);
        System.out.println("수정후 num2 = " + num2);


        System.out.println("***************************************");

        int[] arr ={2,1,3};

        int temp2;

        temp2 = arr[0]; // 2를 임시공간에 저장
        arr[0] = arr[1];
        arr[1] = temp2;

        for(int i : arr){
            System.out.print(i + " ");

        }
    }
}
