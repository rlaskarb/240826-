package com.ohgiraffers.section01.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class 필기1 {
    public static void main(String[] args) {
        /*학습 목표 컬렉션 프레임 워크에 대해 이해 할수 있다.*/

        /*필기
        * java 에서 컬렉션 프레임워크는 여려 개의 다양한 데이터들을
        * 쉽고 효과적으로 처리할수 있도록 표준화 된 방법을 제공하는
        * 클레스들의 집합을 의미한다.
        * 즉, 누군가가 만들어둔 데이터를 효율적으로 저장하는 자료 구죠와
        * 알고리즘이 미리 구현화되어 있다.
        * */

        /*필기
        * Collection 3가지의 인터페이스 중 한가지를 상속받아 구현
        * 1. List
        * 2. Set
        * 3. Map 인터 페이스
        * */

        /*필기
        * 1. List 인터페이스
        *  - 순서가 있는 데이터 집합으로 데이터 중복 조장 허용!!
        *  - Vector , ArrayList , LinkedList , Stack , Queue 등이 있다.
        *
        * 2. Set 인터페이스
        *  - 순서가 없는 데이터 집합으로 데이터 중복 저장을 사용하지 않음.
        *  - HashSet , TreeSet 등이 있다.
        *
        * 3. Map 인터페이스
        *  - 키와 값 한쌍으로 이루어지는 데이터 집합
        *  - Key 는 위에서 나온 Set 방식으로 관리하기 때문에
        *  - 데이터 순서를 관리하지 않고, Key 값은 중복을 허용하지 않는다.
        *  - Key 는 중복이 될 수 없지만 , Key 값이 다르면 value 는 중복이 가능하다.
        *  - HashMap , TreeMap , HashTable , Properties 등이 있다. */

        /*필기
        * 이번 클래스는 List 계열을 다루게 될 것이다.
        * -ArrayList (매우중요 ★★★★★★ , 매우많이 사용함)
        * -내부적으로 배열을 이용해서 요소를 관리하며, 인덱스를 이용해
        * -배열의 요소에 빠르게 접근을 할 수 있다.*/

        //ArrayList 인스턴스를 생성하면 10칸짜리의 배열을 만들어 준다.
        ArrayList alist = new ArrayList();

        //인터페이스는(interface) 생성자를 가질수 없기 때문에 직접적으로 인스턴스 생성이 불가능 하다.
        //그러면 인터페이스를 상속받은 클래스의 인스턴스를 생성하면 된다.
//        List list = new List();
        //List 를 상속받은 ArrayList 클래스를 이용해서 인스턴스 생성 과정이 다형성 이다.

        /*필기
        * 다형성을 적용해서 상위 레퍼런스로 ArrayList 객체를 만들 수 있다.
        * List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
        * 레퍼런스 타입은 List 로 하는 것이 더 유현한 코드를 작석하는 방법이다.
        * */
        List list = new ArrayList();

        // list 에 값을 추가하는 방법
        list.add("apple");
        list.add(12345); // auto- boxing 처리가 됨.
        list.add(3.1864592);
        list.add(new Date());

        //toString 메소드가 Overriding  되어 있기 떄문에
        //주소값이 출력이 안되고, 값이 나오고 있다.
        System.out.println("list = " + list);

        System.out.println("alist = " + alist);
        System.out.println("alist크기 = " + alist.size());

        System.out.println("===========================");
        //원하는 인덱스 위치에 값을 추가해보기
        //새로운 값이 들어갈 인덱스를 지정하면
        //한칸씩 밀려서 값이 들어가게 된다.

        alist.add(1,"banana");
        System.out.println("alist = " + alist);







    }
}
