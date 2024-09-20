package com.ohgiraffers.Exercise2;

import com.ohgiraffers.Exercise.DivideNotZeroException;
import com.ohgiraffers.Exercise.MultipleNotZeroException;

public class ExceptionCheck {
    public void checkCommand(String str , int a) throws NoUseCommandException {
        if(a==0){
            switch (str.charAt(0)){
                case '*' :
                    throw new NoUseCommandException("0 은 뭐랑 곱해도 0입니닷!!!!!");
                case '+','-','%','/' :
                    break;
                default :
                    throw new NoUseCommandException("사용하지 않는 부호입니다!");
            }
        }else {
            switch (str.charAt(0)){
                case '+','-','*','%','/' :
                    break;
                default :
                    throw new NoUseCommandException("사용하지 않는 부호입니다.");
            }
        }
    }
    public void checkNum(String str , int a)
    throws DivideNotZeroException,MultipleNotZeroException {

        if(a==0){ // 두번째 숫자가 0인데
            switch (str){
                case "/","%" : // 앞에 연산자가 나누기하면 예외처리
                    throw new DivideNotZeroException("0으로 나누지 마세요");
                case "*" : // 앞에 연산자가 곱하기 하면 예외처리
                    throw new MultipleNotZeroException("0으로 곱하면 0이야 다른거!!");
            }
        }

    }





}
