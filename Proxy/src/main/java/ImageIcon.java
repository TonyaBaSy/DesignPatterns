/**
 * Created by wang_zhao on 2016/7/9.
 */
public class ImageIcon implements Icon {
    private double height;
    private double weight;
    private String name;

    public ImageIcon(String n, double h, double w) {
        name = n;
        height = h;
        weight = w;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.printf("print an image, name = %s, weight = %f, height= %f\n", name, weight, height);
    }
}
