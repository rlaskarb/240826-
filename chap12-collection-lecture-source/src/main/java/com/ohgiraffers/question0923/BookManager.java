package com.ohgiraffers.question0923;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public BookManager(){
        //해당 BookDTO 객체를 리스트에 담기.
<<<<<<< HEAD
        BookDTO bookDTO = new BookDTO();

        ArrayList<BookDTO> arrayList = new ArrayList<>();


    }

    public void addBook(BookDTO book){
        List list = new ArrayList();

    }


    public void deleteBook(int index ){
        //전달받은 위치의 인덱스 값 제거
    }

    public void searchBook(String btitle){
=======
        BookDTO bookDTO1 = new BookDTO();
    }

    public void deleteBook(int key){
        //전달받은 위치의 인덱스 값 제거
    }

    public void searchBook(String title){
>>>>>>> 688b5c53e855e9dd09bc4bf2aa07ffd7a0284014
        //전달받은 제목으로 리스트에서 조회하여 일치하는 객체가 있으면
        // 해당 도서정보를 출력하고, 없는 경우 조회된 도서가 목록에 없습니다. 출력.
    }

    public void displayAll(){
        // 도서목록 전체 출력
    }
    public List<BookDTO>sortedBookList(int type){
        //정력방식 오름차순/내림차순 정렬 (switch 문 이용)
        return List.of();
    }

    public void printBookList(List<BookDTO>printList){
        //전달받은 리스트 객체의 내용 출력
    }
}
