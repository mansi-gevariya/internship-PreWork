package PrototypePattern;

/**
 * Created by mansi.pattani on 22/1/16.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}