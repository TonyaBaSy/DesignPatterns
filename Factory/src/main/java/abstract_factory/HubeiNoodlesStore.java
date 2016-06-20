package abstract_factory;

/**
 * 湖北热干面饭馆
 * Created by wang_zhao on 2016/6/20.
 */
public class HubeiNoodlesStore extends NoodlesStore {
    @Override
    public Noodles make() {
        return new HubeiNoodles();
    }
}
