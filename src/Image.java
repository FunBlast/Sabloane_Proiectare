public class Image implements Element
{
    public String imageName;

    public Image( String ImageName)
    {
        this.imageName=ImageName;
    }
    public void print()
    {
        System.out.println("Image with name:" + imageName);
    }
}
