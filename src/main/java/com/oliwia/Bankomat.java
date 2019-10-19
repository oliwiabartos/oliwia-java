package com.oliwia;


interface Payment{
//payin/payout dwie metody wymagajace implementacji
    void payIn(int payIn);
    void payOut(int payOut);
    //tu jest metoda domyslna
    default void connection(){
        System.out.println("You are connected");
    }
    //tu jest metoda statyczna
    static String end(){
        return "Disconnected from the bank";

    }
}
//ciała metod
class Bankomat implements Payment{
    @Override
    public void payIn(int payIn) {
        System.out.println("Wpłacileś " + payIn + "złotych");
    }

    @Override
    public void payOut(int payOut) {
        System.out.println("Wypłaciłeś " + payOut+ "złotych");
    }
}
//Wywolujemy kazda metodę
class App4{
    public static void main (String[]args){
        Bankomat bank = new Bankomat();
        bank.connection();
        bank.payIn(1000);
        bank.payOut(100);

        System.out.println("End");
    }
}