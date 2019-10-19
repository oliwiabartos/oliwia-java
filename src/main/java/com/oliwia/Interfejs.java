package com.oliwia;

interface Shape{
    void draw();
}

class Circle implements Shape{


    public void draw() {
        System.out.println("I am drawing a Circle");
    }
}

class Rectangle implements Shape{


    public void draw() {
        System.out.println("I am drawing a Rectangle");
    }
}

class Square implements Shape{

    public void draw() {
        System.out.println("I am drawing a Square");
    }
}

class ShapeDrawer{
    private Shape shape;

    public ShapeDrawer(Shape shape){
        this.shape = shape;
    }
    public void process(){
        System.out.println("starting to draw the chosen shape..");
        this.shape.draw();
        System.out.println("Shape has been drawn");
    }
}
//wyswietla informacje o rozpoczeciu rysowania,wywoluje draw(),wyswietla o zakonczeniu
class Apps{
    public static void main(String[]args){
        ShapeDrawer drawer = new ShapeDrawer(new Square());

        drawer.process();

    }
}
