/**
 * Created by wang_zhao on 2016/6/15.
 */
public class Milk extends Condiment {
    public Milk(double cost, Beverage beverage) {
        super(cost, beverage);
    }

    @Override
    public String getDescription() {
        return super.getBeverage().getDescription() + "牛奶调味剂 " + super.getCost() + "￥\n";
    }

    @Override
    public double cost() {
        return super.getBeverage().cost() + super.getCost();
    }
}
