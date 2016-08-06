/**
 * Created by TonyaBaSy on 2016/8/6.
 */
public class StaticInnerClassSingleton {
    /**
     * ��Ϊ��̬�ڲ�����ص�ʱ�����̰߳�ȫ�ģ����Ը���ľ�̬���ԵĴ������� classloader ���д��������̰߳�ȫ��
     * һ��������Ա����ã���������Ϊ String �� 8 �л������͵ľ�̬���������಻�ᱻ���أ��������ص�һ�֣�
     */
    private static class Instance {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getInstance() {
        return Instance.INSTANCE;
    }
}
