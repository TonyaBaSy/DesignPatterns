/**
 * 装饰模式中的组件，咖啡饮品
 * Created by wang_zhao on 2016/6/15.
 */
public class Coffee extends Beverage {
    public Coffee(double cost) {
        super(cost);
    }

    @Override
    public String getDescription() {
        return "coffee " + super.getCost() + "￥\n";
    }

    @Override
    public double cost() {
        return super.getCost();
    }
}
