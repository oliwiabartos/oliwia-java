package com.oliwia;

abstract class Bank {

    abstract protected void ProsbaWyplaty();

    abstract protected void StanKonta();

    abstract protected void Potwierdzenie();

    void wprowadzKarte() {
        System.out.println("Wprowadź kartę");
    }
    void pin() {
        System.out.println("Wprowadź pin");
    }
    void kwota() {
        System.out.println("Wprowadź kwotę");
    }
    void wyplacanie() {
        System.out.println("Gotówka jest wypłacana");
    }
    void end() {
        System.out.println("Dziekujemy za skorzystanie z uslug");
    }
    public void run() {
        this.wprowadzKarte();
        this.pin();
        this.kwota();
        this.ProsbaWyplaty();
        this.StanKonta();
        this.Potwierdzenie();
        this.wyplacanie();
        this.end();
    }
}
class Bankomat2 extends Bank {

    protected void ProsbaWyplaty() {
        System.out.println("Prosba przyjeta");
    }
    protected void StanKonta(){
        System.out.println("wyswietla stan konta");
    }
    protected void Potwierdzenie(){
        System.out.println("potwierdzenie mozliwosci");
    }
    @Override
    public void run(){
        this.wprowadzKarte();
        this.pin();
        this.kwota();
        this.ProsbaWyplaty();
        this.StanKonta();
        this.Potwierdzenie();
        this.wyplacanie();
        this.end();
    }
}

class App9{
    public static void main(String[]args){
        Bankomat2 bankk = new Bankomat2();

        bankk.run();

    }


}