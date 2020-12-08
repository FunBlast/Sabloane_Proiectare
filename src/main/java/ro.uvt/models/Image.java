package ro.uvt.models;

import java.util.concurrent.TimeUnit;

public class Image implements Element
{
    private String imageName;

    public void print()
    {
        System.out.println("Image with name:" + imageName);
    }

    public Image( String ImageName)
    {
        this.imageName=ImageName;
        new ImageLoaderFactory().load(ImageName);
        try{
            TimeUnit.SECONDS.sleep(3);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }


}
