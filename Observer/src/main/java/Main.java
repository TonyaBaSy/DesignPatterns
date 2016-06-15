/**
 * Created by wang_zhao on 2016/6/14.
 */
public class Main {
    public static void main(String[] args) {
        Observer obs1 = new ObserverImp();
        obs1.setName("Tom");
        Observer obs2 = new ObserverImp();
        obs2.setName("Garry");

        Subject.subscript(obs1);
        Subject.subscript(obs2);

        Subject.setMsg("要吃中午饭啦！");
        Subject.noticeObservers();
    }
}
