/**
 * 开灯命令
 * Created by wang_zhao on 2016/6/23.
 */
public class LightCommand implements Command {
    private Light light;
    public LightCommand(Light l) {
        this.light = l;
    }
    @Override
    public void execute() {
        light.lightOn();
    }
}
