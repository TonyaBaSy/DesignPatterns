import java.util.Collection;
import java.util.HashMap;

/**
 * 发送消息并且接受订阅的主体类
 * Created by wang_zhao on 2016/6/14.
 */
public class Subject {
    // 记录已订阅的观察者的 table
    private static HashMap<String, Observer> observers;
    // 消息内容
    private static String msg;
    static {
        observers = new HashMap<>();
    }

    public static void subscript(Observer o) {
        observers.put(o.getName(), o);
    }
    public static void unsubscribe(Observer o) {
        observers.remove(o.getName());
    }
    public static void noticeObservers() {
        Collection<Observer> obs = observers.values();
        for (Observer o:obs) {
            o.update(msg);
        }
    }

    public static String getMsg() {
        return msg;
    }

    public static void setMsg(String msg) {
        Subject.msg = msg;
    }
}
