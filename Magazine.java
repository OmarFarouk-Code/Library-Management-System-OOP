public class Magazine extends LibraryItem
{
    private int issueNumber;
    private String publicationDate;

    public Magazine(String Id , String Title , int issueNumber , String publicationDate )
    {
        super(Id ,Title);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    void DisplayDetails()
    {
        super.DisplayDetails();
        System.out.println("Issue Number : " + issueNumber);
    }

}
