package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class EX {

    /*람쥐가 축제 아르바이트를 시작했습니다.
     * 맥주를 판매하려면 성인인지 확인을 해야 해요.
     *
     * '나이가 어떻게 되세요?'를 출력하고 나이(정수)를 입력받아,
     * 성인이면 '판매 가능합니다.'를 출력하고,
     * 미성년자이면 '판매 불가능합니다. 음료 코너에서 골라주세요.'
     * 를 출력하세요.
     *
     * -- 입력 예시 --
     * 성인이십니까? 21
     *
     * -- 출력 예시 --
     * 판매 가능합니다.*/



    public void testEx1(){
        System.out.println("람쥐가 축체 노예1에 당첨이되어 일을 시작했습니다.");
        System.out.println("노예가 맥주를 판매할 생각입니다. 성인인지 확인해야 합니다.");
        Scanner sc = new Scanner(System.in);

        System.out.print("람쥐는 성인일까요?? 나이를 입력해주세요 : ");
        int age = sc.nextInt();

        if(age >= 20 ){
            System.out.println("노예의자격조건이 되어 맥주를 판매 할수 있게되었습니다!!!");

        }else{
            System.out.println("아직 젊군요 다음에 캐스팅 하겠습니다.");
        }

        System.out.println("좋은하루였습니다.");
    }


    /* 람쥐가 이벤트 부스에서 짝홀 게임 진행을 맡았습니다.

     * * "짝홀, 그 결과는?"을 출력하고, 도토리 갯수를 정수로 입력받아
     * 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요.    *

     * 짝수인 경우 "짝수입니다~!" 출력,
     * 홀수인 경우 "홀수입니다~!" 출력
     *
     * -- 입력 예시 --
     * 짝홀, 그 결과는? 7
     *
     * -- 출력 예시 --
     * 홀수입니다~!*/

public void testEx2(){

    System.out.println("===============================");
    System.out.println("람쥐녀석 인생역전을 위한 카지노랜드에 왔습니다.");
    System.out.println("홀,짝 게임에 알바비를 올인할 생각인거 같습니다.");
    System.out.println("과연 람쥐녀석의 인생은 어떻게 되었을까요?");

    Scanner sc = new Scanner(System.in);

    System.out.println("람쥐의 알바비를 건 도박 숫자를 입력해주세요.");
    System.out.print("당신의 선택은? :");
    int game = sc.nextInt();
    if(game %2 ==0 ){
        System.out.println("짝수를 선택하셨군요. 아쉽게 되었습니다.");
        System.out.println("알바비를 전부 잃으셨습니다. 다음에 다시 도전하시길 바랍니다.");

    }else {
        System.out.println("홀수를 선택하셨군요. 아쉽게 되었습니다.");
        System.out.println("알바비를 전부 잃으셨습니다. 다음에 다시 도전하시길 바랍니다.");
    }

    System.out.println("그렇게 람쥐는 알콜 중독자의 길에 한걸음 가까워졌습니다.");

}

/* 랍쥐가 숫자 뽑기를 통해 선물을 나눠주는 이벤트 부스에서 일합니다.
 *
 * "당첨 번호가 어떻게 되세요?"를 출력하여,
 * 1~10 사이의 정수 한개를 입력받고,
 * 홀수인지 짝수인지 확인하고,
 * 홀수이면 "홀수네요, 인형 선물입니다!", 홀수가 아니면 "짝수네요,
 *  모자 선물입니다!"라고 출력하세요.
 *
 * 단, 1~10 사이의 정수가 아닌 경우 "당첨 번호는 1~10 사이에만 있어요."
 * 를 출력하세요.
 *
 *
 * -- 입력 예시 --
 * 당첨 번호가 어떻게 되세요? 8
 *
 * -- 출력 예시 --
 * 짝수네요, 모자 선물입니다!*/

public void testEx3(){
    System.out.println("===================================");
    System.out.println("전재산을 탕진한 람쥐 재기를 위해 알바를 구했는데");
    System.out.println("람쥐는 똥을 못 끈어 카지노에서 알바를 구했습니다.");
    System.out.println("숫자 뽑기를 통해 선물을 나눠주는 일을 입니다.");
    System.out.println("당첨번호는 [1번부터 10번까지] 한개를 뽑아서 ");
    System.out.println("홀수인지 짝수인지 확인을 해줘야합니다.");
    System.out.print("당신이 뽑은 숫자는? : ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    if(number%2==1 && number<=10){
        System.out.println("홀수를 뽑으셨군요 축하드립니다.");
        System.out.println("인형에 당첨이 되엇습니다.");
    }else if(number%2==0 && number<=10){
        System.out.println("짝수를 뽑으셨군요 축하드립니다.");
        System.out.println("모자에 당첨되셨습니다.");

    }else {
        System.out.println("당신은 문제를 확인한게 맞습니까?");
        System.out.println("다음기회를 노리시길 바랍니다...");
    }
    System.out.println("람쥐는 계속 노예처럼 일을 하고 있습니다.");

    }

    /*축제에서 무료로 건강 검진을 해주는 부스로 이동했어요.
     *
     * 키와 몸무게를 실수(double)로 입력받아 BMI(신체질량지수)를 계산하고,
     * 계산된 값에 따라
     * 저체중(20 미만)인 경우 "저체중입니다. 축제 음식을 왕창 드세요!",
     * 정상체중(20이상 25미만)인 경우 "정상 체중입니다. 축제 재미있게 즐기세요~",
     * 과제충(25이상 30미만)인 경우 "축제에서 10,000보를 걷고 오시면 상품을 드려요!",
     * 비만(30이상)인 경우 "댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!"를  출력하세요.
     *
     * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 입니다.
     * 계산 예시) BMI = 67 / (1.7 * 1.7)
     *
     * -- 입력 예시 --
     * 키를 입력해 주세요(m) : 1.7
     * 체중을 입력해 주세요(kg) : 67
     *
     * -- 출력 예시 --
     * 정상 체중입니다. 축제 재미있게 즐기세요~
     * */*/

    public void testEx4(){
         


    }


    }



