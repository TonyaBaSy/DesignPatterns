/**
 * Created by wang_zhao on 2016/7/4.
 */
public class Main {
    public static void main(String[] args) {
        Tree[] trees = new Tree[7];
        trees[0] = new Middle("DesignPatterns");
        trees[1] = new Middle("left");
        trees[2] = new Middle("right");
        trees[3] = new Leaf("left-1");
        trees[4] = new Leaf("left-2");
        trees[5] = new Leaf("right-1");
        trees[6] = new Leaf("right-2");

        /**
         * 通过“自造”迭代器，递归遍历所有节点
         */
        trees[0].add(trees[1]);
        trees[0].add(trees[2]);
        trees[1].add(trees[3]);
        trees[1].add(trees[4]);
        trees[2].add(trees[5]);
        trees[2].add(trees[6]);

        trees[0].iterator();
    }
}
