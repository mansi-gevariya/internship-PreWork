package DecoratorPattern;

/**
 * Created by mansi.pattani on 22/1/16.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}