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
     * */

    public void testEx4(){

        System.out.println("람쥐가 몸이 망가진거 같습니다");
        System.out.println("다행이도 무료로 건강검진을 받으로 올 생각을 다했네요");
        System.out.println("간단한 신체검사를 받으로 이동합니다.");
        System.out.println("키(height),몸무게(weight) 소수점까지 입력해야합니다.");
        System.out.println("loser는 소수점에도 집착을 합니다(double)입력받아서");
        System.out.println("BMI(신체질량지수)를 람쥐를 위해서 구해줘야 합니다.");

       Scanner sc = new Scanner(System.in);
        System.out.print("람쥐의 키를 [M]미터로 적어주세요 :");
        double height = sc.nextDouble();
        System.out.print("람쥐의 몸무게를[Kg] 입력해 주세요 : ");
        double weight = sc.nextDouble();
        System.out.println("람쥐의 생활패턴이 보이는군요");
        double bmi = weight/(height * height);

        if (bmi <20) {
            System.out.println("저체중 이네요. 도박에 쓸돈으로 좀 사드세요");
        }else if(bmi>=20 && bmi<25){
            System.out.println("간간히 영양보충을 하셨군요 다행이도 정상입니다.");

        }else if(bmi>=25 && bmi<30){
            System.out.println("탄수화물 중독자입니까?");
            System.out.println("중독자를 위한 이벤트가 있습니다");
            System.out.println("10,000보 을 걷고 오시길바랍니다.");
            System.out.println("달성시 소정의 상품을 드리겠습니다.");

        }else if(bmi>=30){
            System.out.println("돼지에겐 선택권이 없습니다.");
            System.out.println("댄싱 부스에 참가해서 도장을 받아오세요");
            System.out.println("쉽게 찍어주지 않을겁니다. 각오하세요!");
            System.out.println("성공하시고 큰 상품을 가져가세요.");
        }
        System.out.println("람쥐는 오늘도 하루를 생존하였다...");


    }
    /* 간단한 계산기를 만들어 봅시다.
     *
     * 두 개의 정수를 입력 받아 변수에 저장하고,
     * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
     * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램을 종료합니다.
     *
     * -- 입력 예시 --
     * 첫 번째 정수 : 4
     * 두 번쨰 정수 : 3
     * 연산 기호를 입력하세요 : +
     *
     * -- 출력 예시 --
     * 4 + 3 = 7
     */

    public void testEx5(){
        System.out.println("===================================");
        System.out.println(" 다큐로 갑니다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번쨰 정수를 입력해주세요 : ");
        int second = sc.nextInt();

        System.out.println("연산기호 입력 [ + , - , * , / , % ] ");
        char ch = sc.next().charAt(0);
        int result = 0;

        switch(ch){
            case '+' :
                result = first + second ; break;
            case '-' :
                result = first - second ; break;
            case '*' :
                result = first * second ; break;
            case '/' :
                result = first / second ; break;
            case '%' :
                result = first % second ; break;
        }
        System.out.println(first + " " + ch + " " +second + "="+result);

    }

    public void testEx6(){
        System.out.println("==================================");
        /*람쥐는 축제 간식 부스에서 일하게 됐어요.
         *
         * 간식 이름("캬라멜팝콘", "츄로스", "통감자", "도토리탕후루") 중 한 가지를 문자열로 입려하면
         * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
         *
         * 단, 목록에 없는 과일을 입력 시 "해당 상품이 판매하지 않습니다." 출력 후 프로그램을 종료합니다.
         *
         * -- 상품 가격 --
         * 캬라멜팝콘 : 15500원
         * 츄로스 : 3000원
         * 통감자 : 2000원
         * 도토리탕후루 : 5000원
         *
         * -- 입력 예시 --
         * 어떤 간식을 주문하시겠어요? 도토리탕후루
         *
         * -- 출력 예시 --
         * 도토리탕후루의 가격은 5000원 입니다*/

        System.out.println("람쥐가 전직장에서 응모권을 빼돌려서 짤렸어요");
        System.out.println("축제때 한목 단단히 하고자 간식부스를 차렸어요");
        System.out.println("간식 이름은 C[캬라멜팝콘],Ch[츄로스],P[통감자],D[도토리탕후루] 를 판매해요");
        System.out.println("람쥐가 눈탱이 못치도록 가격과 상품명이 맞게 만들어주세요");
        System.out.println("목록에 없는거 판매시 [없는 메뉴 만들는 마법금지!!]출력도 해주세요");
        Scanner sc = new Scanner(System.in);


        System.out.print("간식을 골라주세요~ : ");
        String select = sc.nextLine();

        int price = 0;
        String orderMenu = " ";
        switch (select){
            case "C":
                orderMenu = "캬라멜 팝콘";
                price = 15500;
                break;
            case "Ch":
                orderMenu = "츄로스";
                price = 3000;
                break;
            case "P":
                orderMenu = "통감자";
                price = 2000;
                break;
            case "D":
                orderMenu = "도토리 탕후루";
                price = 5000;
                break;
            default :
                System.out.println("없는 메뉴 만드는 마법사용금지!!!");

        }
        System.out.println(orderMenu +"의 가격은 :" + price + " 원 입니다.");


    }

    public void testEx7(){

    }








    }



