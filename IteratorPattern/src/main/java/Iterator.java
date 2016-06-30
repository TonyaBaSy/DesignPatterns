/**
 * 两个凉茶品牌要合并了，所以要一个遍历所有种类的迭代器
 * Created by wang_zhao on 2016/6/30.
 */
public interface Iterator {
    Iterator createIterator();
    boolean hasNext();
    String next();
}
