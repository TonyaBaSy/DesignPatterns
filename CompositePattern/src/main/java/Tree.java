import java.util.Iterator;

/**
 * 组合模式的抽象类节点类，节点分为两种：中间节点和叶节点
 * Created by wang_zhao on 2016/7/4.
 */
public class Tree {

    private String name;

    public Tree(String name) {
        this.name = name;
    }

    /**
     * 在组合中，一个方法不一定适用于所有类型的节点，面对这种情况，有时候，最好的选择是抛出异常，这是java为继承带来的缺陷的一些补救措施
     * @param t
     */
    public void add(Tree t) {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    /**
     * 迭代器方法
     */
    public void iterator() {
        throw new UnsupportedOperationException();
    }
}
