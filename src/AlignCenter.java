public class AlignCenter implements AlignStrategy
{
    public void render(Paragraph p)
    {
        System.out.println("___"+p.getText()+"___");
    }
}
