/**
 * Created by wang_zhao on 2016/6/30.
 */
public class Jdb implements Iterator{
    private String[] types;
    private int size;
    // 用来记录当前迭代的位置(下标)
    private int now;


    public Jdb() {
        types = new String[10];
        types[0] = "易拉罐加多宝";
        types[1] = "小瓶加多宝";
        types[2] = "大瓶加多宝";
        size = 3;
    }

    public void addType(String type) {
        if (size >= types.length)
            System.out.println("类型容器已经满了");
        else {
            types[size++] = type;
        }
    }

    public String getType(int i) {
        if (i >= 0 && i < size) {
            return types[i];
        } else {
            System.out.println("提供的下表有错误！");
            return null;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator createIterator() {
        now = 0;
        return this;
    }

    @Override
    public boolean hasNext() {
        return now < size;
    }

    @Override
    public String next() {
        return getType(now++);
    }
}
