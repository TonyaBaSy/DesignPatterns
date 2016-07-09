/**
 * Image 的代理类，模拟照片的获取
 * Created by wang_zhao on 2016/7/9.
 */
public class ImageProxy implements Icon {
    private Icon icon;
    private String url = "http://www.icon.com/icon-dog";
    @Override
    public double getHeight() {
        System.out.println("我只是个代理");
        return icon.getHeight();
    }

    @Override
    public double getWeight() {
        System.out.println("我只是个代理");
        return icon.getWeight();
    }

    @Override
    public void print() {
        System.out.println("我只是个代理");
        if (icon == null) {
            System.out.println("get icon from url: " + url);

            System.out.println("getting...");
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("got it!");
            icon = new ImageIcon("dog", 100, 100);
            icon.print();
        }
        else
            icon.print();
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
}
