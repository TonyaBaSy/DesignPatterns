package behavior;

/**
 * 发声策略之 高叫
 * Created by wang_zhao on 2016/6/13.
 */
public class HighSound implements SoundBehavior {
    public void makeSound() {
        System.out.println("高声叫！");
    }
}
