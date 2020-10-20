import java.util.ArrayList;

public class book {
    String title;
    public Autor autor;
    public ArrayList<Element> content = new ArrayList<>();

    public book(String title)
    {
        this.title = title;
    }
    public void addAutor(Autor a)
    {
        autor =a;
    }
    public void addContent(Element e)
    {
        content.add(e);
    }
    public void print()
    {
        System.out.println("Book:" + title);
        System.out.println("Author:" + autor.name);
        for(Element e: content)
        {
            e.print();
        }
    }
}
