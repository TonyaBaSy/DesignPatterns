import sun.nio.cs.ext.MacHebrew;

import java.util.HashMap;

/**
 * 糖果机
 * Created by wang_zhao on 2016/7/9.
 */
public class Machine {
    private HashMap<String, State> states;
    private State nowState;
    // 糖果的总数
    private int number = 2;

    public Machine() {
        states = new HashMap<>();

        State[] ss = new State[4];
        ss[0] = new NoQuarterState(this);
        ss[1] = new HasQuarterState(this);
        ss[2] = new SoldOutState(this);
        ss[3] = new SoldState(this);
        nowState = ss[0];

        for (State s : ss) {
            states.put(s.getName(), s);
        }
    }

    public void insertQuarter() {
        nowState.insertQuarter();
    }

    public void ejectQuarter() {
        nowState.ejectQuarter();
    }

    public void turnCrank() {
        nowState.turnCrank();
    }

    public void dispose() {
        nowState.dispose();
    }

    public void releaseBall() {
        if (number != 0)
            number--;
    }

    public int getCount() {
        return number;
    }

    public String getName() {
        return "no_quarter";
    }

    public State getNowState() {
        return nowState;
    }

    public void setNowState(State nowState) {
        this.nowState = nowState;
    }

    public void addState(State s) {
        states.put(s.getName(), s);
    }

    public State getState(String name) {
        return states.get(name);
    }
}
