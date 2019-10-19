package com.oliwia;
import java.lang.*;
interface Telephone2 {

    void callTo(String name);
    default void callToMom(){

        System.out.println("I am calling to my mom");

    }
    static String getMyNumber(){
        return "+48 731 803 988";
    }
}
class App3{
    public static void main(String[]args){
        System.out.println(Telephone2.getMyNumber());
    }
}
