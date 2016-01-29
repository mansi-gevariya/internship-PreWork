package FactoryPattern;

/**
 * Created by mansi.pattani on 27/1/16.
 */
public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
