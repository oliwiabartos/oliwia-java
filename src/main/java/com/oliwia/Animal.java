package com.oliwia;

interface Animal {

    String voice();

    String name();

}

class Dog implements Animal{

    @Override
    public String voice() {
        return "hau hau";
    }

    @Override
    public String name() {
        return "Dog";
    }
}

class Cat implements Animal{

    @Override
    public String voice() {
        return "miau";
    }

    @Override
    public String name() {
        return "cat";
    }
}
class Mouse implements Animal{

    @Override
    public String voice() {
        return "pi";
    }

    @Override
    public String name() {
        return "Mouse";
    }
}
class AnimalRecognizer{

    public String recognize(Animal animal){
        return "This is: " +animal.name() +" and sounds like: "+animal.voice();

    }
}

class App5{
    public static void main(String[]args){
        AnimalRecognizer recognizer = new AnimalRecognizer();
        String recognizedAnimal = recognizer.recognize(new Cat());

        System.out.println(recognizedAnimal);
    }
}