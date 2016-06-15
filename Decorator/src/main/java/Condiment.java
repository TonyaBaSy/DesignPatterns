/**
 * 装饰着类：调料
 * Created by wang_zhao on 2016/6/15.
 */
public abstract class Condiment extends Beverage {
    // 被修饰的类：饮料
    private Beverage beverage;
    private double cost;
    public Condiment(double cost, Beverage beverage) {
        super(cost);
        this.cost = cost;
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}