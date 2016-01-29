package AbstractFactoryPattern;

/**
 * Created by mansi.pattani on 22/1/16.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}