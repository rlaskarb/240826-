package com.ohgiraffers.section04.time;

import java.time.*;

public class Application1 {
    public static void main(String[] args) {
        
        /*학습목표 time 패키지에서 제공하는 클래스들의 사용 문법*/
        
        /*필기
        * time 패키지는 JDK 1.8에서 추가가 되었다.
        * Data , Calender 가 가지고 있는 한계점을 극복하기 위해 나왔다.
        * LocalTime , LocalDate , LocalDataTime , ZonedDataTime
        * 등 대표적인 클래스가 있다.
        * */
        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);

        System.out.println("===========================");
        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow);
        LocalDate dateOf = LocalDate.of(2024,8,15);

        System.out.println("============================");
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow = " + dateTimeNow);

        System.out.println("============================");
        ZonedDateTime zoneDateTime = ZonedDateTime.now();
        System.out.println("zoneDateTime = " + zoneDateTime);
        
//        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(dateOf,timeNow, ZoneId.of("Africa/ Harare"));
//        System.out.println("zonedDateTime1 = " + zonedDateTime1);
    }
    
}
