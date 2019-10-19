package com.oliwia;

public class Application {

        public static void main (String[]args){
            System.out.print("Starting...");

            int age =16;
            char sex = 'm';

            if(age <= 15){
                System.out.println("Too young");

            }else{
                System.out.println("Age is okey");

                if(sex=='m'){
                    System.out.println("User is a male");
                }else if (sex=='f'){
                    System.out.println("user is a female");
                }else{
                    System.out.println("unknown sex");

                }
            }
            System.out.println("End of the program");
        }
}
