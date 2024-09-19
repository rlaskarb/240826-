package com.ohgiraffers.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        List<Book_DTO> list = new ArrayList<>();


        list.add(new Book_DTO(1,"백설공주","그림형제",9900));
        list.add(new Book_DTO(3,"심청전","오태석",1200));
        list.add(new Book_DTO(4,"신델렐라","샤를페로",12100));
        list.add(new Book_DTO(5,"산타클로즈이야기","프랭크바움",22500));

        for(int i = 0 ; i < list.size(); i++){
            System.out.println(i + "번째 : " +list.get(i));
        }

        System.out.println("============================");
        for(Book_DTO b : list ){
            System.out.println(b.toString());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("책이름 , 저자 , 가격 순서대로 입력해 주세요.");

        Book_DTO bookDto = new Book_DTO();
        bookDto.setNo(2);
        System.out.println();
        System.out.print("책이름 : ");
        bookDto.setName(sc.nextLine());
        System.out.print("저자 : ");
        bookDto.setWriter(sc.nextLine());
        System.out.print("가격 : ");
        bookDto.setPrice(sc.nextInt());

//        list.add(1,bookDto=new Book_DTO(2,sc.nextLine(),sc.nextLine(),sc.nextInt()));

        list.add(1,bookDto);

        for(int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for















    }
}
