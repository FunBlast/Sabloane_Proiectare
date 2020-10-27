import java.awt.*;

public class ImageProxy implements Element{
    public String name;
    Image realImage=null;

    public ImageProxy(String name) {
        this.name = name;
    }

    Image loadImage()
    {
        if(realImage== null)
        {
            realImage = new Image(this.name);
        }
        return realImage;
    }

    public void print() {
        loadImage().print();
    }
}
