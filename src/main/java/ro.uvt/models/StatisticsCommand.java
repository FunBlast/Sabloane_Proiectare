package ro.uvt.models;

public class StatisticsCommand implements Command{

    public void execute() {
        Book book = DocumentManager.getInstance().getBook();
        if(book!=null)
        {
        BookStatistics stats = new BookStatistics();
        book.accept(stats);
        stats.printStatistics();
        }
    }
    
}
