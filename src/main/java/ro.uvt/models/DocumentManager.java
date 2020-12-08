package ro.uvt.models;

public class DocumentManager {
    public static DocumentManager instance;
    private static Book book;

    private DocumentManager(){}

    public static DocumentManager getInstance(){
        if(instance==null)
        {
            instance=new DocumentManager();
        }
        return instance;
    }

    public static Book getBook(){
        return book;
    }
    
    public void setBook(Book b){
        book=b;
    }
}
