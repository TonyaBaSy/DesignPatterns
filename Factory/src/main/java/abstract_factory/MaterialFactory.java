package abstract_factory;

/**
 * 抽象工厂模式的抽象工厂类
 * Created by wang_zhao on 2016/6/20.
 */
public interface MaterialFactory {
    Dough createDough();
    Source createSource();
}
