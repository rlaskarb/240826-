package com.ohgiraffes.section03.dto;

public class MemberDTO {
    /*필기
     * DTO , Dto m VO <-- 데이터를 묶어두기 위한 클래스
     * */
    private int memberNo; // 회원번호
    private String name; // 회원 이름
    private int age; // 나이
    private char gender; // 성별
    private double height; // 키
    private double weight; // 몸무게
    private boolean isActivated; // 회원탈퇴 여부

    /*필기
     * 설정자(setter),와 접근자 (getter) 는 실무에서 암묵적으로 통용되는 규칙이 존대한다.
     *
     * 필기
     * 설정자의 작성 규칙
     * -필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로
     * 선언을 하고, 호출 당시 전달되는 매개변수의 값을 이용하여 필드 값을 변경.
     * [표현식]
     * public void setName(String name){
     *         this.name = name;
     * }
     * --> set 필드명 (매개변수){
     *    this.필드명 = 매개변수;
     * }
     * */


    /*필기
     *접근자 작성 규칙
     * -필드의 값을 반환 받을 목적의 메소드 집합을 의미한다.
     * 필드에 접근을 해서 setter 를 통해 적용된 값을 return 을 통해
     * 반환을 하게 되며, 이때 환환 타입은 반환하려는 값의 자료형과 일치.
     * [표현식]
     * public 자료형 get 필드명(){
     *       return 반환값;
     * }
     * */
//art+insert //단축기 Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isActivated() {
        return isActivated;
    }

    //art+insert //단축기

    /*목차 2. getter(접근자) 작성*/
    public int getMemberNo(){
        return memberNo;
    }


    //art+insert //단축기 Setter
    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}




