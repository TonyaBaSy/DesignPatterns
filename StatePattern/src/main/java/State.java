/**
 * Created by wang_zhao on 2016/7/9.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispose();
    String getName();
}
