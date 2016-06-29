/**
 * Created by wang_zhao on 2016/6/29.
 */
public abstract class Template {
    public void template() {
        method1();
        // 如果钩子为true，则顺序执行，否则2、3倒序执行
        if (hook()) {
            method2();
            method3();
        }
        else {
            method3();
            method2();
        }
        System.out.println("end\n");
    }

    public void method1() {
        System.out.println("执行算法步骤 1 ");
    }
    public void method2() {
        System.out.println("执行算法步骤 2 ");
    }

    public abstract void method3();

    // 一个钩子方法，用来传递算法执行顺序的信息
    public boolean hook() {
        return true;
    }
}
