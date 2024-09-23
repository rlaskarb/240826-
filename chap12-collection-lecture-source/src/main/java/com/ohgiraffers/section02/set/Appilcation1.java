package com.ohgiraffers.section02.set;

import java.util.HashSet;
import java.util.Iterator;

public class Appilcation1 {
    public static void main(String[] args) {

        /* 필기
        * Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복 저장을 허용하지 않는다.(null 값도 하나의 null 만 허용
        * */


        /*필기
        * HashSet 클래스
        * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        * 해시 알고맂ㅁ을 사용해서 검색 속도가 빠르다는 장점을 가지고 있다.
        * */


        HashSet<String> hset = new HashSet<>();
        hset.add(new String("java"));
        hset.add(new String("mysql"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));

        //1. 저장순서 유지 안함 !
        System.out.println("hset = " + hset);
        System.out.println("========================");
        //2. 중복 된 값 혀용 여부 확인 .
        hset.add(new String("java"));
        System.out.println("hset = " + hset);
        System.out.println("저장 된 객체의 수 = " + hset.size());
        System.out.println("mysql 포함 되어 있는지 확인 = " + hset.contains(new String("mysql")));

        /*필기
        * Set 은 저장 순서를 유지하지 않기 때문에
        * 저장 된 객체를 하나씩 꺼낼 방법이 없다.
        * */

        System.out.println("========================");
        /*목차 1. toArray() 메소드를 이용해 배열로 변경 후 반복문 사용*/
        // toArray() -> Object 클래스.
        Object[] arr = hset.toArray();
        for(int i =0; i <arr.length; i++){
            System.out.println(i +" : " + arr[i]);
        }


        System.out.println("======================");
        /*목차 2. iterator() 반복자를 통한 목록화 */
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
