package com.ohgiraffers.section01.list;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*학습목표 컬렉션 프레임워크에 대해 이해할 수 있다.*/

        /*필기
        * java에서 컬렉션 프레임워크는 여려 개의 다양한 데이터들을
        * 쉽고 효과적으로 처리할수 있도록 표준화 된 방법을 제공하는
        * 클레스들의 집합을 의미한다.
        * 즉, 누군가가 만들어둔 데이터를 효율적으로 저장하는 자료 구조와
        * 알고리즘이 미리 구현되어 있다.
        *  */

        /* 필기
        *  Collection 3가지의 인터페이스 중 한가지를 상속받아 구현
        *  1. List
        *  2. Set
        *  3. Map 인터페이스*/

        /*필기
        * 1.List 인터페이스
        *   -순서가 있는 데이터 집합으로 테이터 중복 조장 허용 !!
        *   -Vector , ArrayList , LinkedList , Stack , Queue 등이 있다.
        *
        * 2. Set 인터페이스
        *   -순서가 없는 테이터 집합으로 데이터 중복 저장을 사용하지 않음.
        *   -HashSet , TreeSet 등이 있다.
        *
        * 3. Map 인터페이스
        *   -키와 값 한 쌍으로 이루어지는 데이터 집합
        *   -Key 는 위에서 나온 Set 방식으로 관리하기 때문에
        *   -데이터 순서를 관리하지 않고, Key 값은 중복을 허용하지 않는다.
        *   -Key 는 중복이 될 숭 없지만 , Key 값이 다르면 value 는 중복이 가능하다.
        *   -HashMap , TreeMap , HashTable , Properties 등이 있다.
        * */

        /*필기
        *  이번 클래스는 List 계열을 다루게 될 것이다.
        *   -ArrayList (매우중요 ★★★★★ , 매우 많이 사용함)
        *   -가장 많이 사용이 되는 컬렉션 클래스
        *   -내부적으로 배열을 이용해서 요소를 관리하며, 인데스를 이용해
        *   -배열의 요소에 빠르게 접근을 할 수 있다.
        * */

        /*필기
        *  ArrayList 는 배열의 단점을 보완하기 위해 만들어졌다.
        *  배열은 크기를 변경할 수 없고 , 요소의 추가 , 삭제 , 정렬 등이 복잡하다.
        *  ArrayList 는 이러한 단점을 해결하기 위해
        *  -크기변경,요소의추가,
        *  우리에게 제공을 해주고 있다.
        * */

        //ArrayList 인스턴스를 생성하면 10칸짜리의 배열을 만들어 준다.
        ArrayList alist = new ArrayList();

        //인터 페이스는 (interface) 생성자를 가질수 없기 때문에 직접적으로 인스턴스 생성이 불가능하다.
        // 그러면 어떻게 해야 될까?
        // List 인터페이스를 상속받은 클래스로 인스턴스를 생성하면 된다.
//        List list = new List();
        //List 를 상속받은 ArrayList 클래스를 이용해서 인스턴스 생성
        // 과정이 다형성이다.
        /*필기
        *  다형성을 적용해서 상위 레퍼런스로 ArrayList 객체를 만들 수 있다.
        * List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
        * 레퍼런스 타입은 List 로 하는 것이 더 유연한 코드를 작성하는 방법이다.
        * */
        List list = new ArrayList();

        // list 에 값을 추가하는 방법
        alist.add("apple");
        alist.add(123); //auto-boxing 처리가 됨
        alist.add(1.4567); // int,double 이러한 기본(원시)값을 객체 -> Integer ,Double
        alist.add(new Date());

        //toString 메소드가 Overriding 되어 있기 때문에
        // 주소값이 출력이 안 되고 , 값이 나오고 있다.
        // 출력해보면 우리가 작성한 순서대로 값이 들어있는 것을 확인 할 수 있다.
        System.out.println("alist = " + alist);

        System.out.println("alist 의 크기 :" + alist.size());

        System.out.println("===============================");
        // 인덱스로 관리를 한다? -> for 문 즉 반복문을 사용해서 규칙적으로 접근 가능
        for(int i =0; i< alist.size(); i++){
            //인덱스에 해당하는 값을 가져올 때는 get() 메소드를 사용한다.
            System.out.println( i + "번째 인덱스의 값 :" + alist.get(i));
        }

        // 데이터의 중복저장 허용 확인
        alist.add("apple");
        System.out.println("alist = " + alist);
        System.out.println("============================");
        // 원하는 인뎃스 위치에 값을 추가해보기
        //새로운 값이 들어갈 인덱스를 지정하면
        //한칸씩 밀려서 값이 들어가게 된다.
        alist.add(1,"banana");
        System.out.println("alist = " + alist);

        // remover 삭제는 명령어 !
        System.out.println("============================");
        alist.remove(1);
        System.out.println("alist = " + alist);

        System.out.println("===========================");
        //Wrapper 클래스로 boolean 값 Boolean 타입으로 바꾸기
        //set 애는 지정된 위치에 값을 수정
        alist.set(1,Boolean.valueOf(true));
        System.out.println("alist = " + alist);


        System.out.println("===========================");
        /*필기 모든컬렉션 프레임 워크 클래스는 제네릭 클래스로 지정되어 있다.
        *     따라서 우리가 < > 내부에 타입을 지정하면 해당하는 공간은
        *     지정한 타입 외에는 사용할 수 없게 된다.
        * */
        List<String>stringList = new ArrayList<>();
        stringList.add("apple");
        //제네릭 문법으로 타입을 지정하게 되면, 지정한 타입 외에 값은 저장할 수 없다.
//        stringList.add(123);
        stringList.add("banana");
        stringList.add("Orange");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("stringList = " + stringList);

        /*필기
        * 정렬 기능도 사용할 수 있따.
        * 저장 순서를 유지하고 있는 stringList 를 오름차순 정렬
        * */

        System.out.println("================================");
        Collections.sort(stringList);
        System.out.println("stringList = " + stringList);

        /*필기
        * 조금 복잡하지만, 내림차순 정렬도 가능하다
        * 하지만 ArrayList 에서는 내림차순 정렬을 제공하지 않고
        * List 의 또 다른 구현체인 LinkedList 에서 제공한다.
        * */

        // List<String>stringList = new LinkedList<>(stringList);
        System.out.println("===================================");
        stringList = new LinkedList<>(stringList);

        /*필기
        * Iterator (반복자) 란?
        * Collection 인터페이스의 iterator()  메소드를 이용해서
        * 인스턴스를 생성할수 있다.
        * 컬렉션에 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용
        * 반복자 라고 불리우며, 반복문을 통해서 값을 하나씩 꺼내기 위한 용도이다.
        * 인덱스로 관리되는 컬렉션이 아닌 경우느 반복문을 사용해서 요소에 접근할 수
        * 없기 떄문에 인덱스를 사용하지 않고도 반복문을 쓰기 위한 목록을 만들어주는
        * 역할이라고 보면 된다.
        * hasNext() : 다음 요소를 가지고 있으면 true, 없으면 false
        * next() : 다음 요소 반환
        * */

        Iterator<String> dInter = ((LinkedList<String>)stringList).descendingIterator();

        /*필기
        * dIter 라는 레퍼런스 변수에 내림차순 한 결과를 담았기 때문에
        * 다시 한번 ArrayList 로 옮길 것이다.
        * */

        List<String> descList = new ArrayList<>();
        while (dInter.hasNext()){
            descList.add(dInter.next());
        }
        System.out.println("descList = " + descList);
        
        





    }
}
