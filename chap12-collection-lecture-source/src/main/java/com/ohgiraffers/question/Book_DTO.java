package com.ohgiraffers.question;

public class Book_DTO {

    private int no;
    private String name;
    private String writer;
    private int price;

// 기본 생성자
    public Book_DTO(){}

    // 모든 필드를 초기화 하는 생성자
    public Book_DTO(int no, String name , String writer, int price){
        this.no = no;
        this.name =name;
        this.writer =writer;
        this.price =price;
    }

// getter / setter
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // toString


    @Override
    public String toString() {
        return "Book_DTO{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                ", price=" + price +
                '}';
    }

}


