import java.util.ArrayList;

public class Section implements Element {
    public String sectionTitle;
    public ArrayList<Element> content=new ArrayList<>();

    Section(String t)
    {
        sectionTitle=t;
    }
    int add(Element e)
    {
        content.add(e);
        return content.size();
    }
    void remove(Element e)
    {
        content.remove(e);
    }
    public Element getElement(int index){
        return content.get(index);
    }

    public void print()
    {
        System.out.println(sectionTitle);
        for(Element e:content)
        {
            e.print();
        }
    }
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
        for(Element elem : content){
            elem.accept(visitor);
        }
    }
}