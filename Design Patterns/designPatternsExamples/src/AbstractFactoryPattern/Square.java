package AbstractFactoryPattern;

/**
 * Created by mansi.pattani on 22/1/16.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}