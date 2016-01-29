package AbstractFactoryPattern;

/**
 * Created by mansi.pattani on 22/1/16.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}