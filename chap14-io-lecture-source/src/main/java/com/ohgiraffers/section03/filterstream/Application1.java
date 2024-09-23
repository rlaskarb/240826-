package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        /*title BufferedWriter 와 BufferedReader 에 대해 이해할수 있다.*/

        /*comment
        * io(입출력) 스트림은 기본 스트림(section01,section02)과
        * 필터 스트림 으로 분류할 수 있다.
        * 기본 스트림은 외부 데이터에 집접 연결하는 스트림이고,
        * 필터 스트림은 외부 데이터에 직접 연결하는 것이 아닌
        * 기본 스트림에 추가로 사용할수 있는 스트림이다.
        * 주로 성능 향상 시키는 목적으로 사용하게 된다.
        *
        * 사용방법
        * 생성자 쪽에 매개변수로 다른 스트림을 전달한다.
        * */

        BufferedWriter bw = null;

        try {

            bw =new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            bw.write("안녕하세요\n");
            bw.write("반갑습니다\n");

            /*
            * 보조 스트림을 사용하는 경우 데이터가 가득 차지 않는 상태에서
            * 강제로 내보내기 (flush)를 해줘야 한다 */

            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(bw !=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /*comment
        * 입력한 데이터 BufferedReader 로 얽어드리기
        * */

        BufferedReader br = null;
        try {


            br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));
            
            /*comment
            * readLine() 메소드 : 버퍼의 한 줄을 읽어 와서 문자열로 반환을 해준다.
            * 한줄 단위로 읽기 때문에 기존 스트림 보다 성능면에서 우수하다.
            * */
            
            // 값 담을 변수
            String temp;
            
            while ((temp = br.readLine()) !=null){
                System.out.println("temp = " + temp);
                
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(bw !=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
