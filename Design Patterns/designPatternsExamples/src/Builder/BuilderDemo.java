package Builder;

/**
 * Created by mansi.pattani on 27/1/16.
 */
public class BuilderDemo {

    public static void main(String[] args){

        LunchOrder.Builder builder=new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Ham");

        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
