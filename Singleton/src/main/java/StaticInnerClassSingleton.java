/**
 * Created by TonyaBaSy on 2016/8/6.
 */
public class StaticInnerClassSingleton {
    /**
     * 因为静态内部类加载的时候是线程安全的，所以该类的静态属性的创建是有 classloader 进行创建，是线程安全的
     * 一个类的属性被引用，而且属性为 String 或 8 中基本类型的静态常量，该类不会被加载（被动加载的一种）
     */
    private static class Instance {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getInstance() {
        return Instance.INSTANCE;
    }
}
