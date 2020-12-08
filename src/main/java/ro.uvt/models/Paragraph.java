package ro.uvt.models;

public class Paragraph implements Element
{
    private String text;
    public AlignStrategy align;

    public String getText()
    {
        return this.text;
    }
    public Paragraph( String text)
    {
        this.text=text;
    }
    public void print()
    {
        if(align == null)
        {
            System.out.println("Paragraful: "+this.text);
        }
        else
        {
            align.render(this);
        }
    }
    public void setAlignStrategy(AlignStrategy a)
    {
        this.align=a;
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
