package com.oliwia;


interface Quest{
    String process();
}

class DeadIslandQuest implements Quest {

    public String process(){

            return  ", umarł w obronie księżniczki.";

    }

}

class EliteKnightQuest implements Quest {

    public String process(){

        return  "Rycerz w ładnej zbroi";
    }
}

class Knight{

    public String story( Quest quest ) {

        return  quest.process()  ;
    }
}


class App6 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Knight knight = new Knight();


        String answer = knight.story( new EliteKnightQuest() ) +  knight.story( new DeadIslandQuest() );


        System.out.println( "Taka to historia: \n" + answer );

    }
}