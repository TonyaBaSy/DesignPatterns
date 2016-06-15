import animal.Duck;
import animal.HighDuck;
import behavior.HighFly;

/**
 * Created by wang_zhao on 2016/6/13.
 */
public class Main {
    /**
     * Strategy Pattern 策略模式：将变化剥离，抽象成一组接口，然后将接口的变量放置在对应的对象中，
     * 利用多态实现不同策略之间的切换。
     * [面向接口编程]
     * 添加一个策略即对一个策略接口进行实现，做到面向接口编程，降低主体对象（Duck）与对象算法
     * （Behavior）之间耦合程度。
     * [“有一个”比“是一个”更好]
     * “有一个”，说明是组合关系；“是一个”，说明是继承关系。继承关系耦合程度高于组合，修改起来不方便。
     * 例如，需要添加一个“鸭子表演”功能的时候，组合关系只需创建并实现一个 display 接口，继承关系需要
     * 对分别各个子类进行改造。
     * @param args
     */
    public static void main(String[] args) {
        Duck highDuck = new HighDuck("小红崖子");
        highDuck.setFlyBehavior(new HighFly());
        highDuck.sound();
        highDuck.fly();
    }
}
