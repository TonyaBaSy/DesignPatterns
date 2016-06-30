import java.util.ArrayList;
import java.util.List;

/**
 * 和其正凉茶，凉茶品牌的领导者
 * Created by wang_zhao on 2016/6/30.
 */
public class Hqz implements Iterator {
    private List<String> types;
    // 用来记录当前迭代的位置(下标)
    private int now;

    public Hqz() {
        types = new ArrayList<>();
        types.add("易拉罐和其正");
        types.add("小瓶和其正");
        types.add("大瓶和其正");
    }

    public String getType(int i) {
        if (i >= 0 && i < types.size())
            return types.get(i);
        else {
            System.out.println("给定的下标有错误");
            return null;
        }
    }

    public void addType(String type) {
        types.add(type);
    }

    @Override
    public Iterator createIterator() {
        now = 0;
        return this;
    }

    @Override
    public boolean hasNext() {
        return now < types.size();
    }

    @Override
    public String next() {
        return getType(now++);
    }


}
