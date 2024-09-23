package com.ohgiraffers.question0923;

public class BookDTO {
    private int bNo; // 도서번호
    private int category; //장르 분류번호
    private String title; // 도서제목
    private String author; // 도서저자


    // 기본 생성자
    public void BookDTO(){}

    //모든 필드를 초기화 하는 새성자
    public void BookDTO(int bNo,int category, String title, String author){
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;

    }

    // getter / setter


    public int getCategory() {return category;}

    public void setCategory(int category) {this.category = category;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getAuthor() {return author;}

    public void setAuthor(String author) {this.author = author;}


    //toString

    @Override
    public String toString() {
        return "BookDTO{" +
                "category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
