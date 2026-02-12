//PARENT CLASS
public class LibraryItem 
{
    //Private Variables
    private String Id;
    private String Title;
    private boolean Available;

    //Constructor
    public LibraryItem(String Id , String Title)
    {
        this.Id = Id;
        this.Title = Title;
    }

    //Getters and Setters
    void getTitle ()
    {
        System.out.println("The Title is : " + Title);
    }

    void setTitle ( String InputtedTitle)
    {
        Title = InputtedTitle;
    }

    void getAvailabilty ()
    {
        if ( Available == true ) 
        {
            System.out.println("It's available");
        }
        else 
        {
            System.out.println("It's not available");
        }
    }

    void setAvailabilty (boolean Availabilty)
    {
        Available = Availabilty;
    }

    void DisplayDetails ()
    {
        System.out.println("ID : " + Id);
        getTitle();
        getAvailabilty();
    }
}
