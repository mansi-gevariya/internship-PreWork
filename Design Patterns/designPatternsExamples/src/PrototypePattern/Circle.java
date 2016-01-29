package PrototypePattern;

/**
 * Created by mansi.pattani on 22/1/16.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}