package AbstractFactoryPattern;

/**
 * Created by mansi.pattani on 22/1/16.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
