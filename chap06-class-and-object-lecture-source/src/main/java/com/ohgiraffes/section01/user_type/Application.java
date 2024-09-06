package com.ohgiraffes.section01.user_type;

public class Application {
    public static void main(String[] args) {
        /*학습목표 클래스가 무엇인지 이해할 수 있다*/

        /*필기
        * 지금까지 우리는 자바에서 제공하는 자료형을 다루어 보았다.
        * ex) int,char,String,double[] 등등
        * 회원 정보를 관리하기 위해 (아이디,비밀번호,이름,나이,성별,취미들)
        * 지금까지 배운 내용으로 값을 넣고 출력해보자.*/

        /*목차 1. 변수를 이용한 회원 관리 데이터 관리*/
        String id = "user01";
        String pwd = "pass01";
        String name = "김남규";
        int age = 20;
        char gender = '남';
        String[] hobbies = new String[]{"야구","놀기","먹기","자기"};

        System.out.println("id = " + id );
        System.out.println("pwd = " + pwd );
        System.out.println("age = " + age );
        System.out.println("name = " + name );
        System.out.println("gender = " + gender );
//        System.out.println("hobbies = " + hobbies );
        System.out.print("hobbies :");
        for(int i = 0; i<hobbies.length;i++){
            System.out.print(hobbies[i] + " ");
        }
        System.out.println();
    }
    /*이렇게 각기 다른 변수로 데이터를 관리하게 되면 여러가지 단점이 있다.
    * 1, 변수명을 다 알아야 한다.
    * 2, 모든 회원 정보를 인자로 메소드 호출 시 값을 달달 해야 한다면
    *    너무 많은 값을 전달인자로 보내야 해서 한눈에 안들어온닷
    * 3, 리던은 1개의 값만 가능하기 때문에 회원 정보를 묶어ㅓ
    *     리턴 값으로 사용할 수 없다. Why? 서로 다른 자료형 이기 때문에!!
    * */


}
