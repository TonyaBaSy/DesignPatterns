/**
 * 观察者的主体接口
 * Created by wang_zhao on 2016/6/14.
 */
public interface Observer {
    void update(String msg);
    void setName(String name);
    String getName();
}
