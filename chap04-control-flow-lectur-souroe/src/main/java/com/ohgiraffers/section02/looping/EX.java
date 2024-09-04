package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class EX {

    public void Ex1() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }

    public void Ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합 :" + sum);
    }

    public void Ex3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 2; i <= num; i = i + 2) {
            sum += i;

        }
        System.out.println("1부터" + num + "까지 짝수의 합 :" + sum);
    }

    public void Ex4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(i + " 번째 : " + ch);
        }
    }

    public void Ex5() {
        Scanner sc = new Scanner(System.in);

        for (int i = 'a'; i <= 'z'; i++) {

            System.out.print((char) i);
        }
        System.out.println();
    }

    public void Ex6() {

        String str1 = "토";
        String str2 = "마";
        String result = " ";

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                result += str1;
            } else {
                result += str2;
            }
        }
        System.out.println(result);
        sc.close();

    }


    public void Ex7() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
            int num = sc.nextInt();

            boolean check = true;

            if (num <= 1) {
                System.out.println("잘못 입력 하셨습니다. 다시 입력하세요.");

            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        check = false;
                        break;
                    }
                }
                System.out.println(check ? "소수다." : "소수가 아니다.");
                break;
            }
        }
        sc.close();
    }

    public void Ex8(){
        /* 1부터 100 사이의 난수를 발생시키고
         * 정수를 입력 받아서 입력받은 정수가 발생한 난수보다 큰 경우 "입력하신 정수보다 큽니다."를,
         * 입력받은 정수보다 난수가 작은 경우 "입력하신 정수보다 작습니다."를 출력하며
         * 입력한 정수와 난수와 같은 경우가 될 때까지 난수 맞추기를 반복하는 프로그램을 만드세요.
         *
         * 단, 입력한 정수와 난수가 같은 경우 "정답입니다. n회 만에 정답을 맞추셨습니다."라고
         * 정답을 입력한 횟수도 함께 출력되도록 해야 합니다.
         * 첫 회부터 바로 난수를 맞추는 경우는 1회만에 정답을 맞춘 것입니다.
         *
         * 정답을 맞추는 경우 위 내용을 출력하고 프로그램이 종료되도록 작성하세요.
         *
         * -- 프로그램 예시 --
         * 정수를 입력하세요 : 5
         * 입력하신 정수보다 작습니다.
         * 정수를 입력하세요 : 3
         * 입력하신 정수보다 큽니다.
         * 정수를 입력하세요 : 4
         * 정답입니다. 3회만에 정답을 맞추셨습니다.
         * */
        Scanner sc =new Scanner(System.in);
        int random = new Random().nextInt(100)+1;
        int count = 1;

        while(true){
            System.out.print("정수를 입력 하세요 : ");
            int num = sc.nextInt();

            if(num>random){
                System.out.println("입력하신 정수보다 작습니다!");
                count++;
            }else if(num<random){
                System.out.println("입력하신 정수보다 큽니다!");
                count++;
            }else{
                System.out.println("정답입니다." + count + "회 만에 정답을 맞추셨습니다!");
                break;
            }
        }
        sc.close();
    }

    public void Ex9(){
        /* 문자열을 하나 입력 받고,
         * 검색할 문자형을 하나 입력 받아
         * 입력받은 문자열에 검색할 문자가 몇 개 포함되어 있는지를 출력하는 프로그램을 만드세요.
         *
         * 단, 문자열에 영문자가 아닌 문자가 섞여 있는 경우에는
         * 검색할 문자를 입력받지 않고 "영문자가 아닌 문자가 포함되어 있습니다." 출력 후 프로그램을 종료하세요.
         *
         * 또한 일치하는 문자의 경우 대소문자를 구분합니다.
         *
         * -- 프로그램 예시 --
         *
         * -- 정상 동작의 경우 --
         * -- 입력 예시 --
         * 문자열 입력 : apple
         * 문자 입력 : p
         *
         * -- 출력 예시 --
         * 포함된 갯수 : 1개
         *
         * --------------------
         * -- 영문자가 아닌 문자 포함된 경우 --
         * -- 입력 예시 --
         * 문자열 입력 : app2le
         *
         * -- 출력 예시 --
         * 영문자가 아닌 문자가 포함되어 있습니다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력 하세요 : ");
        String str = sc.nextLine();

        for(int i=0; i< str.length(); i++){
            char temp =str.charAt(i);
            if(!(temp >= 'a' && temp <='z' || temp >='A'&& temp<='Z')){
                System.out.println("문자열이 포함 되지 않았습니다.");
                sc.close();
                return;
            }
        }
        System.out.print("문자 입력 : ");
        char ch =sc.next().charAt(0);

        int count = 0;

        for(int i =0; i < str.length();i++){
            if(ch == str.charAt(i)){
                count++;
            }
        }
        System.out.println("포함된 갯수 :" + count + "개");

    }




}
