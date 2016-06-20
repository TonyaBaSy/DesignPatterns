package abstract_factory;

/**
 * 面条饭馆抽象类
 * Created by wang_zhao on 2016/6/20.
 */
public abstract class NoodlesStore {
    private MaterialFactory material;

    /**
     * 使用抽象工厂模式完成原料（面团和调味剂）的创建，使用工厂方法模式完成面条的创建
     */
    public void createNoodles(){
        material.createDough();
        material.createSource();
        make();
    }

    public abstract Noodles make();


    public MaterialFactory getMaterial() {
        return material;
    }

    public void setMaterial(MaterialFactory material) {
        this.material = material;
    }
}
