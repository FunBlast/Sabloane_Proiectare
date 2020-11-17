public class BookStatistics implements Visitor{
    private int imagesCounter = 0;
    private int tablesCounter = 0;
    private int paragraphsCounter = 0;
    private int sectionsCounter = 0;
    private int books = 0;
    

    public void visit(Image image)
    {
        imagesCounter++;
    }
    
    public void visit(ImageProxy imageProxy)
    {
        imagesCounter++;
    }

    public void visit(Paragraph paragraph)
    {
        paragraphsCounter++;
    }

    public void visit(Table table)
    {
        tablesCounter++;
    }

    public void visit(Section section)
    {
        sectionsCounter++;
    }

    public void printStatistics()
    {
        System.out.println("Book statistics:");
        System.out.println("*** Number of images: " + imagesCounter);
        System.out.println("*** Number of tables: " + tablesCounter);
        System.out.println("*** Number of paragraphs: " + paragraphsCounter);
        System.out.println("*** Number of sections: " + sectionsCounter);
        System.out.println("*** Number of books: " + books);
    }

    @Override
    public void visit(Book b) {
        books++;
    }
}
