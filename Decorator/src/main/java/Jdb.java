/**
 * Created by wang_zhao on 2016/6/15.
 */
public class Jdb extends Beverage {

    public Jdb(double cost) {
        super(cost);
    }

    @Override
    public String getDescription() {
        return "加多宝 " + super.getCost() + "￥\n";
    }

    @Override
    public double cost() {
        return super.getCost();
    }
}
