package ro.uvt.models;

public class AlignLeft implements AlignStrategy{

    public void render(Paragraph p)
    {
        System.out.println("___"+p.getText() );
    }
}
