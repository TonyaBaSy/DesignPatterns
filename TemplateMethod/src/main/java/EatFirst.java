/**
 * 先去吃饭，再执行算法 3 的类
 * Created by wang_zhao on 2016/6/29.
 */
public class EatFirst extends Template{

    @Override
    public void method3() {
        eat();
        System.out.println("执行算法步骤 3");
    }

    public void eat() {
        System.out.println("去吃饭，吃完后开始执行算法步骤 3");
        System.out.println("吃饭时的思考：第 3 步比较重要，先执行再去执行算法步骤 2");
    }

    @Override
    public boolean hook() {
        return false;
    }
}
