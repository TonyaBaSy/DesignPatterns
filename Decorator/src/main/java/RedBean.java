/**
 * 装饰类
 * Created by wang_zhao on 2016/6/15.
 */
public class RedBean extends Condiment {
    public RedBean(double cost, Beverage beverage) {
        super(cost, beverage);
    }

    @Override
    public String getDescription() {
        return super.getBeverage().getDescription() + "红豆调味剂 " + super.getCost() + "￥\n";
    }

    @Override
    public double cost() {
        return super.getBeverage().cost() + super.getCost();
    }
}
