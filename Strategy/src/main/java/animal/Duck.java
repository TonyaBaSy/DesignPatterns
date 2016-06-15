package animal;

import behavior.FlyBehavior;
import behavior.SoundBehavior;

/**
 * 鸭子祖先类，是该设计模式的主体对象
 * Created by wang_zhao on 2016/6/13.
 */
public class Duck {
    protected String name;
    // 拥有的两个行为：飞行和发出声音，这是两类不同的策略
    private FlyBehavior flyBehavior;
    private SoundBehavior soundBehavior;

    public Duck(String name) {
        this.name = name;
    }

    public void swing() {

        System.out.println(name + "，正在游泳");
    }

    public void fly() {
        if (flyBehavior == null) {
            System.out.println(name + "，还没有学会飞翔");
            return;
        }
        flyBehavior.fly();
    }

    public void sound() {
        if (soundBehavior == null) {
            System.out.println(name + "，还没有学会叫");
            return;
        }
        soundBehavior.makeSound();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public SoundBehavior getSoundBehavior() {
        return soundBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }
}
