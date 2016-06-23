/**
 * 命令的发出者（Client）
 * Created by wang_zhao on 2016/6/23.
 */
public class Main {
    public static void main(String[] args) {
        Command c = new LightCommand(new Light());
        c.execute();
    }
}
