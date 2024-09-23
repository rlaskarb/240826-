package com.ohgiraffes.section01.user_type;

public class Member {

    /*필기
     * 지금까지 우리는 클래스 내부에 메소드만 작성을 했었다
     * 근데 사실을 메소드를 작성하지 않고, 바로 변수를 선언할 수 있다.
     * 이것을 전역변수(필드 == 인스턴스변수 == 속성) */

    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobbies;

    public static void main(String[] args) {

        /*목차 2. 사용자 정의의 자료형 사용하기*/

        /*목차 2-1. 변수 선언 및 객체 생성*/

        /*필기
         * 클래스 변수명 = new 자료형();
         * -위에 구문은 객체(instance) 를 만드는 구문이다.
         * ex) int[] arr = new int[5];
         * 클래스는 사용자 정의의 자료형이 되며, 클래스가 가지고 있는
         * 변수 or 메소드를 사용하기 위해서는 new 할당 연산자로
         * heap 메모리 공간에 할당을 해야 한다. */

        Member member = new Member();

        /*목차 2. 생성된 인스턴스( 객체 )의 초기값 확인하기 */

        /*필기
         * 우리가 Member 클래스에 작성한 전역변수(필드)에 접근하기 위해서는
         * 레퍼런스변수명.변수명 <- 이방법으로 접근 할 수 있따.
         * '.' 은 참조 연산자 라고 하는데, 레퍼런스 변수가 참조하고 있는(주소를 가르키는)
         * 곳으로 접근한다 라는 의미이다.*/

        System.out.println("mermber.id : " + member.id);
        System.out.println("mermber.pwd : " + member.pwd);
        System.out.println("mermber.name : " + member.name);
        System.out.println("mermber.age : " + member.age);
        System.out.println("mermber.gender : " + member.gender);
        System.out.println("mermber.hobbies : " + member.hobbies);

        /*목차 2-3 필드(전역변수)에 접근해서 변수처럼 사용해보기*/
        System.out.println("***********************************");
        member.id = "user02";
        member.pwd = "pass02";
        member.name = "위궤양 개츠비";
        member.age = 20;
        member.gender = '남';
        member.hobbies = new String[]{"야구","놀기","먹기","자기"};


        System.out.println("mermber.id : " + member.id);
        System.out.println("mermber.pwd : " + member.pwd);
        System.out.println("mermber.name : " + member.name);
        System.out.println("mermber.age : " + member.age);
        System.out.println("mermber.gender : " + member.gender);
        System.out.print("mermber.hobbies : ");
        for(int i=0; i<member.hobbies.length; i++){
            System.out.print(member.hobbies[i] +" ");
        }
    }
}


