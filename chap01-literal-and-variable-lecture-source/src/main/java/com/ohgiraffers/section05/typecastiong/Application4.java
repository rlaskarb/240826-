package com.ohgiraffers.section05.typecastiong;

public class Application4 {

    public static void main(String[] args) {

        /*수업목표 형변환 시 주의점을 이해하고 사용할 수 있다. */

        /*필기
        * 형변환 시 주의점.
        * 데이터 손실 !!!!!
        * */

        /*목차 1 의도하지 않는 데이터 손실 */
        int inum = 290; // 1byte -128 ~ 127
        byte bnum =(byte)inum;

        System.out.println("bnum = " + bnum);

        /*목차 2 의도한 데이터 손실 */
        double height = 170.5;

        int floorHeight = (int)height;

        System.out.println("floorHeight = " + floorHeight);


    }
}
