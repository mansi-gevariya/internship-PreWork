package FactoryPattern;

/**
 * Created by mansi.pattani on 27/1/16.
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType){
        switch (siteType){
            case BLOG:
                return new Blog();

            case SHOP:
                return new Shop();

            default:
                return null;
        }
    }
}
