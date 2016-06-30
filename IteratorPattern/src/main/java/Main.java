/**
 * Created by wang_zhao on 2016/6/30.
 */
public class Main {
    public static void main(String[] args) {
        Hqz hqz = new Hqz();
        hqz.addType("散装和其正");
        Jdb jdb = new Jdb();
        jdb.addType("散装加多宝");
        Iterator iterator = hqz.createIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        iterator = jdb.createIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
