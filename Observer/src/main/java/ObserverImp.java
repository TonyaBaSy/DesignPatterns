/**
 * 一个观察者的实现类
 * Created by wang_zhao on 2016/6/14.
 */
public class ObserverImp implements Observer {
    String name;

    /**
     * 观察者通过被主体调用 update 方法来得到新的消息。
     * @param msg
     */
    @Override
    public void update(String msg) {
        System.out.println(name +" 收到新消息：" + msg);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
