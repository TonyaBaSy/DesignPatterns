/**
 * Created by wang_zhao on 2016/7/9.
 */
public class SoldState implements State {
    private Machine machine;

    public SoldState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("等一等投币，正在制作糖果");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你已经转动了曲棍，不能退钱给你");
    }

    @Override
    public void turnCrank() {
        System.out.println("重复转动是没有效果的");
    }

    @Override
    public void dispose() {
        System.out.println("糖果出现了！！！");
        machine.releaseBall();
        if (machine.getCount() > 0)
            machine.setNowState(machine.getState("no_quarter"));
        else
            machine.setNowState(machine.getState("sold_out"));
    }

    @Override
    public String getName() {
        return "sold";
    }
}
