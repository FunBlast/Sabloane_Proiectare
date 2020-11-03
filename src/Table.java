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

}
