package behavior;

/**
 * 飞行策略之 低空飞行
 * Created by wang_zhao on 2016/6/13.
 */
public class LowFly implements FlyBehavior {

    public void fly() {
        System.out.println("低空飞行！");
    }
}
