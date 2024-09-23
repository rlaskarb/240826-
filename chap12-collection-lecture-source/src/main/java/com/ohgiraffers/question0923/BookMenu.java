package com.ohgiraffers.question0923;

import java.util.Scanner;

public class BookMenu {

    //도서 관리 프로그램

    public void mainMenu () {
        // 1.새 도서 추가 / addBook(inputBook()이 리턴한 객체)실행
        // 2.도서정보 정렬 후 출력 / printBookList() 실행
        //                      => 인자로 selectSortedBook()하여 리턴받은 리스트 객체사용
        // 3.도서 삭제 / deleteBook(inputBookNo()이 리턴한 도서 번호) 실행
        // 4.도서 검색출력 / searchBook(inputBookTitle()이 리턴한 도서 제목) 실행
        //                 => 결과가 있는경우 해당 도서를 출력하고,
        //                 => 결과가 없는 경우 "조회한 도서가 목록에 없습니다"
        // 5. 전체 출력 / displayAll()실행
        //              -> 비어있을 경우 "출력결과가 없습니다."
        //              -> 비어있지 않을 경우 전체 출력
        // 6. 끝내기 // main()으로 리턴
        // 메뉴 화면 반복 실행 처리
        // 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행
<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);
        BookManager bm = new BookManager();






=======
>>>>>>> 688b5c53e855e9dd09bc4bf2aa07ffd7a0284014

    }

    public BookDTO inputBook(){
        // "도서 제목 : " >> 입력 받음
        // "도서 장르 : " (1: 인문 / 2:자연과학 / 3:의료 / 4.기타) : " >>입력 받음(숫자로)
        // "도서 저자 : " >> 입력받음
        // 매개변수 생성자를 이용하여 위의 초기값을 이용한  BookDTO 객체 리턴
<<<<<<< HEAD

        Scanner sc = new Scanner(System.in);
        System.out.print("도서 제목을 입력하세요");
        String title = sc.nextLine();
        System.out.println();
        System.out.println("1번 : 인문 // 2번 : 자연과학 // 3번 : 의료 // 4번 : 기타 ");
        System.out.print("도서 장르를 선택하세요(번호로 입력해주세요) : ");
        int category = sc.nextInt();
        System.out.println();
        System.out.print("도서 저자를 입력하세요 : ");
        String author = sc.nextLine();

        return null; // 여기부터 다시 !!
=======
        return null;
>>>>>>> 688b5c53e855e9dd09bc4bf2aa07ffd7a0284014
    }

    public int intputBookNo(){
        //" 도서 번호 : " >> 입력 받음 >> 리턴
        return 0;
    }

    public String inputBookTitle(){
        //"도서제목 : " >> 입력 받음 >> 리턴
        return null;
    }

}


