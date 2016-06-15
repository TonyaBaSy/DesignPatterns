package behavior;

/**
 * 飞行类策略之 高空飞行
 * Created by wang_zhao on 2016/6/13.
 */
public class HighFly implements FlyBehavior {
    public void fly() {
        System.out.println("高空飞行！");
    }
}
