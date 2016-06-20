package abstract_factory;

/**
 * 湖北工厂实现类
 * Created by wang_zhao on 2016/6/20.
 */
public class HuBeiFactory implements MaterialFactory {

    public Dough createDough() {
        return new BigDough();
    }

    public Source createSource() {
        return new HaiTianSource();
    }
}
