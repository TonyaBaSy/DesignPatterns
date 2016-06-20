/**
 * Created by wang_zhao on 2016/6/20.
 */
public class QuickSingleton {
    private static QuickSingleton singleton;

    /**
     * 进行双检查验证
     * @return
     */
    public static QuickSingleton getInstance(){
        if (singleton == null) {
            synchronized (QuickSingleton.class) {
                if (singleton == null) {
                    singleton = new QuickSingleton();
                }
            }
        }
        return  singleton;
    }
}
