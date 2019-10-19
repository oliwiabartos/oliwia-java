package com.oliwia;

abstract class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    abstract public void voice();
}

class Male extends Person{
    public Male(String name){
        super(name);
    }

    public void voice(){
        System.out.println("Hey there!");
    }
}
class App7{
    public static void main(String[]args){
        Male male =new Male("John");
        String name = male.getName();
        System.out.println(name);

        male.voice();
    }
}
