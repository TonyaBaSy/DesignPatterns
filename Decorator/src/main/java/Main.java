/**
 * Created by wang_zhao on 2016/6/15.
 */
public class Main {
    public static void main(String[] args) {
        Coffee c = new Coffee(10);
        Milk milk = new Milk(4, c);
        RedBean bean = new RedBean(8, milk);
        String list = bean.getDescription();
        System.out.println(list);
        System.out.println("总消费 " + bean.cost() + "￥");
    }
}
