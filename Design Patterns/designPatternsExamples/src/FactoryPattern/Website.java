package FactoryPattern;

import java.util.List;
import java.util.ArrayList;
/**
 * Created by mansi.pattani on 27/1/16.
 */
public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website(){
        this.createWebsite();
    }

    public List<Page> getPages(){
        return  pages;
    }

    public abstract void createWebsite();

}
