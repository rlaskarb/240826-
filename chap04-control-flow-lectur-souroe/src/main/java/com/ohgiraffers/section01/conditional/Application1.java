package com.ohgiraffers.section01.conditional;

public class Application1 {
    public static void main(String[] args) {

//        System.out.println("===========================");
//
//        A_if a =new A_if();
//        a.testSimpleIfStatement();
//
//        System.out.println("===========================");
//
//        a.testNestedIfStatement();

        System.out.println("============else===============");

        B_ifElse b = new B_ifElse();
//        b.testIfElseStatement();
//        b.testNestedIfElseStatement();

        System.out.println("===========else if=================");
        C_ifElseIf c =new C_ifElseIf();
//        c.testIfElseIfStatement();
//        c.testNestedIfElseIfStatement();

        System.out.println("=============swith================");
        D_switch d =new D_switch();
//        d.testSwitchStatement();
        d.testSwitchVendingMachine();



    }




}
