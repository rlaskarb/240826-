package com.ohgiraffers.section03.map;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /*comment
        * properties 란?
        * HashMap 을구현하여 사용방법이 거의 유사하지만
        * 차별점은 key 와 value 모두 문자열만 사용할수 있다는 것이다
        * 사용하는 예시는 대부분 설정관련 파일의 값을 읽어
        * 어플리케이션에 적용하기 우해 사용한다. */

        //Properties 는 값의 의미를 가졌다.
        Properties prop = new Properties();
        //값 설정
        prop.setProperty("driver","com.mysql.cj.jdbc.Driver");
        prop.setProperty("url","jdbc:mysql://localhost/menu");
        prop.setProperty("username","ohgiraffers");
        prop.setProperty("password","ohgiraffers");

        System.out.println("prop = " + prop);

        System.out.println("=======================================");
        
        //예외처리 -> 파일의 입력과 출력에 대한 것은 예외처리를 강제화 해두었다.
        try {
            prop.store(new FileOutputStream("driver.dat"),("jdbc driver"));
            prop.store(new FileWriter("driver.txt"),("jdbc driver"));
            prop.storeToXML(new FileOutputStream("driver.xml"),("jdbc driver"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
