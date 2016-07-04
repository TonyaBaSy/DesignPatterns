import java.util.ArrayList;
import java.util.List;

/**
 * 中间节点
 * Created by wang_zhao on 2016/7/4.
 */
public class Middle extends Tree{
    private String name;
    private List<Tree> points = new ArrayList<>();

    public Middle(String name) {
        super(name);
        this.name = name;
    }

    /**
     * 中间节点：打印完自己的名字以后，对Array进行遍历，递归
     */
    @Override
    public void iterator() {
        print();
        for (Tree t : points) {
            t.iterator();
        }
    }

    @Override
    public void add(Tree t) {
        points.add(t);
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
