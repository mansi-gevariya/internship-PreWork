package AbstractFactoryPattern;

/**
 * Created by mansi.pattani on 22/1/16.
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
