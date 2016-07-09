/**
 * 糖果机中有了15分钱
 * Created by wang_zhao on 2016/7/9.
 */
public class HasQuarterState implements State {
    private Machine machine;

    public HasQuarterState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已投币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退还 15 分钱");
        machine.setNowState(machine.getState("no_quarter"));
    }

    @Override
    public void turnCrank() {
        System.out.println("曲棍被转动");
        machine.setNowState(machine.getState("sold"));
    }

    @Override
    public void dispose() {
        System.out.println("没有糖果出现");
    }

    @Override
    public String getName() {
        return "has_quarter";
    }


}
