/**先执行完算法 3，再去吃饭的类
 * Created by wang_zhao on 2016/6/29.
 */
public class EatLast extends Template {
    @Override
    public void method3() {
        System.out.println("执行算法步骤 3：执行就去吃饭吃饭了。");
        eat();
    }

    public void eat() {
        System.out.println("开始吃饭！");
    }
}
