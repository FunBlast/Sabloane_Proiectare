public class mp3File implements Element{
    String nume;

    public mp3File(String nume) {
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


