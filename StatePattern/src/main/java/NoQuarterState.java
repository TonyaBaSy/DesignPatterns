/**
 * Created by wang_zhao on 2016/7/9.
 */
public class NoQuarterState implements State {
    private Machine machine;

    public NoQuarterState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入了 15 分钱");
        machine.setNowState(machine.getState("has_quarter"));
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果机里没有钱可以退还");
    }

    @Override
    public void turnCrank() {
        System.out.println("不能转动曲棍，你还没有投入 15 分钱");
    }

    @Override
    public void dispose() {
        System.out.println("你得先付钱");
    }

    @Override
    public String getName() {
        return "no_quarter";
    }
}
