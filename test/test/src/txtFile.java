public class txtFile implements Element{
    String nume;

    public AlignStrategy align;

	public txtFile(String nume) {
		this.nume = nume;
    }
    
    public String getNume()
    {
        return this.nume;
    }

    public void print()
    {
        if(align == null)
        {
            System.out.println("Textul: "+this.nume);
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
    public void accept(VisitorSpace visitor) {
        visitor.visit(this);
    }
}
