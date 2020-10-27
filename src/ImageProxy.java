import java.awt.*;

public class ImageProxy implements Element{
    public String name;
    Image realImage=null;

    public ImageProxy(String name) {
        this.name = name;
    }

    public void print()
    {
        if(realImage== null)
        {
            realImage = new Image(this.name);
        }
        realImage.print();
    }
}
