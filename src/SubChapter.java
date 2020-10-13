import java.util.ArrayList;

public class SubChapter {
    public String SubChName;
    public ArrayList<Paragraph> paragraphs = new ArrayList<>();
    public ArrayList<Image> images = new ArrayList<>();
    public ArrayList<Table> tables = new ArrayList<>();
    public SubChapter(String SubChName) {

        this.SubChName=SubChName;
    }

    public void createNewParagraph(String p)
    {
        Paragraph paragraph = new Paragraph(p);
        paragraphs.add(paragraph);
    }

    public void createNewImage(String i)
    {
        Image image = new Image(i);
        images.add(image);
    }

    public void createNewTable(String t)
    {
        Table table = new Table(t);
        tables.add(table);
    }

    public void print() {
        System.out.println("Subchapter:" + SubChName);
        for (Paragraph p : paragraphs) {
        System.out.println("Paragraph:" + p.text);}
        for (Image i : images) {
            System.out.println("Image with name:" + i.ImageName);}
        for (Table t : tables) {
            System.out.println("Table with Title:" + t.TaTitle);}
    }
}
