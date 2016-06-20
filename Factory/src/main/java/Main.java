import abstract_factory.HuBeiFactory;
import abstract_factory.HubeiNoodlesStore;

/**
 * Created by wang_zhao on 2016/6/20.
 */
public class Main {
    public static void main(String[] args) {
        HubeiNoodlesStore store = new HubeiNoodlesStore();
        store.setMaterial(new HuBeiFactory());
        store.createNoodles();
    }
}
