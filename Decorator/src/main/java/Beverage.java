/**
 * 饮料的抽象类，该设计模式的主体
 * 饮料有不同的类型，还可以加入不同的调料
 * Created by wang_zhao on 2016/6/15.
 */
public abstract class Beverage {
    private double cost;

    public Beverage(double cost) {
        this.cost = cost;
    }

    // 获得描述
    public abstract String getDescription();
    // 计算价格
    public abstract double cost();

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
