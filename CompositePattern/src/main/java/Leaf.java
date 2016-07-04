/**
 * 叶节点
 * Created by wang_zhao on 2016/7/4.
 */
public class Leaf extends Tree {
    private String name;

    public Leaf(String name) {
        super(name);
        this.name = name;
    }

    /**
     * 叶子节点：仅仅输出自己的名字
     */
    @Override
    public void iterator() {
        print();
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    @Override
    public void add(Tree t) {
        throw new UnsupportedOperationException("叶节点不支持 add 方法！");
    }
}
