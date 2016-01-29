package AbstractFactoryPattern;

/**
 * Created by mansi.pattani on 22/1/16.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}