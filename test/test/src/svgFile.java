public class svgFile implements Element{
    String nume;

    public svgFile(String nume) {
        this.nume = nume;
    }

    public String getNume()
    {
        return this.nume;
    }

    public void print()
    {
        System.out.println(nume);
    }
    
    public void accept(VisitorSpace visitor) {
        visitor.visit(this);
    }
}
