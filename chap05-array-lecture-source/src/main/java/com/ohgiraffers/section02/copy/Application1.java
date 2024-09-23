package com.ohgiraffers.section02.copy;

public class Application1 {

    public static void main(String[] args) {

        /*학습목표 배열의 복사 개념중 얕은 복자에 대해 이해할 수 있다. */

        /*필기
        * 배열의 복사에는 크게 두가지 종류가 있다.
        * 1. 얕은 복사(shallow copy) : stack 의 주소 값만 복사
        * 2. 깊은 복사(deep copy) : heap 의 배열에 저장 된 값 복사
        * */

        /*필기
        * 얕은 복사란?, stack 에 저장되어 있는 배열의 주소값만
        * 복사하는 것이다. 따라서 두개의 레퍼런스 변수는 동일한
        * 배열의 주소값을 가지고 있다.
        * 하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을
        * 수정( 값 변경) 을 하게 되면
        * 다른 레퍼런스 변수로 배열에 접근했을 때도 동일한 배열을
        * 가리키고 있기 때문에 변경된 값이 반영되어 있다.*/

        //목차 1. 얕은 복사 확인을 위한 원본 배열 만들기
        int[] originArr = {1,2,3,4,5};
        //int[] originArr =new int[5]

        //목차 2. 새로운 배열 만들어서 주소 복사하기
        int[] copyArr = originArr;

        //목차 3. hashcode() 를 사용해서 진짜로 같은 지 비교
        System.out.println("원본 배열의 주소값 : " + originArr.hashCode());
        System.out.println("복제 배열의 주소값 : " + copyArr.hashCode());

        //목차 4. 원본 배열과 복제배열의 값을 반복문을 통해 출력
        for(int i = 0; i<originArr.length; i++){
            System.out.print(originArr[i] + " ");
        }
        System.out.println();
        System.out.println("***************************");

        for(int i = 0; i<copyArr.length; i++){
            System.out.print(copyArr[i] + " ");

        }
        System.out.println();
        System.out.println();

        //목차 5. 복제한 배열의 값을 수정하고, 원본도 반영 되었는 지 확인.
        copyArr[0] = 99;

        for(int i = 0; i<originArr.length; i++){
            System.out.print(originArr[i] + " ");
        }
        System.out.println();
        System.out.println("***************************");
        for(int i = 0; i<copyArr.length; i++){
            System.out.print(copyArr[i] + " ");
        }

        }

}
