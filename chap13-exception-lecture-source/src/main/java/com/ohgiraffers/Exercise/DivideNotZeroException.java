package com.ohgiraffers.Exercise;

import com.ohgiraffers.section2.userexception.exception.PriceNegativeException;

import java.io.IOException;

public class DivideNotZeroException extends Exception {

    public DivideNotZeroException(String massage){
        super(massage);
    }
}
