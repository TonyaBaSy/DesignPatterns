/**
 * Created by wang_zhao on 2016/7/9.
 */
public class Main {
    public static void main(String[] args) {
        Machine m = new Machine();
        m.insertQuarter();
        m.ejectQuarter();

        m.insertQuarter();
        m.turnCrank();
        m.dispose();
        m.insertQuarter();
        m.turnCrank();
        m.dispose();
        m.insertQuarter();
        m.turnCrank();
        m.dispose();
    }
}
