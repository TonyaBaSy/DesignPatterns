/**
 * Created by wang_zhao on 2016/7/9.
 */
public class SoldOutState implements State {
    private Machine machine;

    public SoldOutState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经售完，明天再来吧");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果机里没有钱可以退还");
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动曲棍，今天这里已经没有糖果给你了");
    }

    @Override
    public void dispose() {
        System.out.println("没有糖果出现");
    }

    @Override
    public String getName() {
        return "sold_out";
    }
}
