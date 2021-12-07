/*
 * Copyright (c)   walid elzohery  11/29/21, 12:26 PM
 * All Rights reserved
 */

package com.common;

public class DoaException extends Exception{
    public DoaException(){
        super();
    }

    @Override
    public String toString() {
        return "this is doa exception";
    }

    public DoaException(String message){
        super(message);
    }
}
