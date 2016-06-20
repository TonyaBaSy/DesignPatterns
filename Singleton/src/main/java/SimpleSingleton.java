/**
 * Created by wang_zhao on 2016/6/20.
 */
public class SimpleSingleton {
    // 在创建变量的时候就进行初始化
    private static SimpleSingleton singleton = new SimpleSingleton();

    public static SimpleSingleton getInstance() {
        return singleton;
    }
}
