public class Book extends LibraryItem 
{
    private String author;
    private int pageCount;
    private String ISBN;

    public Book (String Id , String Title , String author ,int pageCount, String ISBN)
    {
        super(Id , Title);
        this.author = author;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
    }

    void DisplayDetails ()
    {
        super.DisplayDetails();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pageCount);
        System.out.println("ISBN: " + ISBN);  
    }


}
