import java.util.ArrayList;

public class Director implements Element{
    String nume;
    public ArrayList<Element> continut = new ArrayList<>();

    public Director(String nume) {
        this.nume = nume;
    }

    public void add(Element e){
        continut.add(e);
    }

    public void print()
    {
        System.out.println(nume);
        for(Element e:continut)
        {
            e.print();
        }
    }

    public String getNume()
    {
        return this.nume;
    }

    public void accept(VisitorSpace visitor){
        visitor.visit(this);
        for(Element elem : continut){
            elem.accept(visitor);
        }
    }
}
