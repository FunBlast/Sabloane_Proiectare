package ro.uvt.models;

public class Table implements Element
{
    private String tableTitle;

    public Table( String TaTitle)
    {
        this.tableTitle=TaTitle;
    }
    public void print()
    {
        System.out.println(tableTitle);
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
