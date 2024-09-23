package com.ohgiraffers.section01.list;

import java.util.LinkedList;
import java.util.Queue;

public class Application4 {
    public static void main(String[] args) {

        /*학습목표 */

        /* 필기
        * Queue
        * 선형 메모리 공간에 데이터를 저장하는
        * 선입선철 (FIFO First In First Out) 방식 자료구조
        * Queue 인테페이스를 상속 받는 하위 인터페이스는 다양하지만
        * 대부분은 LinkedList 를 이용해서 인스턴스를 생성할 수 있다.*/

        //Queue 도 인터페이스이기 때문에 인스턴스 생성 불가.
        Queue<String> que = new LinkedList<>();

        // Queue 데이터 넣게 offer() 메소드를 이용한다.
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        /*필기
        * Queue 에서 데이터를 꺼내는 방법은 2가지 이다.
        * peek() : 해당 큐(Queue)에 가장 앞에 있는 요소(먼저 들어온)를 반환한다.
        * poll() : 해당 큐에 가장 앞에있는 요소 반환 후 제거한다.*/

        System.out.println("======================");
        System.out.println("peek() :" +que.peek());
        System.out.println("peek() :" +que.peek());
        System.out.println("que = " + que);
        System.out.println("======================");
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("que = " + que);
        System.out.println("======================");





    }
}
