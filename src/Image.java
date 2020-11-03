import java.nio.channels.FileLockInterruptionException;
import java.util.concurrent.TimeUnit;

public class Image implements Element
{
    private String imageName;

    public Image( String ImageName)
    {
        this.imageName=ImageName;
        try{
            TimeUnit.SECONDS.sleep(3);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public void print()
    {
        System.out.println("Image with name:" + imageName);
    }
}
