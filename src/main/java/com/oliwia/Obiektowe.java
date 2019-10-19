package com.oliwia;
class UserValidator {

    public boolean validateAge(int age) {
        if (age <= 15) {
            System.out.println("Too young");
            return false;
        } else {
            System.out.println("User age is okey");
            return true;
        }
    }

    public void validateSex(char sex) {
        if (sex == 'm') {
            System.out.println("User is a male");
        } else if (sex == 'f') {
            System.out.println("user is a female");
        } else {
            System.out.println("unknown sex");
        }
    }
}
    class App{
        public static void main (String[]args){
            System.out.println("starting..");

            int age = 15;
            char sex = 'm';

            UserValidator validator = new UserValidator();

            boolean isHigherThanFifteen = validator.validateAge(age);
            if(isHigherThanFifteen){
                validator.validateSex(sex);
            }

            System.out.println("end of the program");


        }

    }
