//PARENT CLASS
public class LibraryItem 
{
    //Private Variables
    private int Id;
    private String Title;
    private boolean Available;

    //Constructor
    public LibraryItem(int Id , String Title)
    {
        this.Id = Id;
        this.Title = Title;
    }

    //Getters and Setters
    String getTitle ()
    {
        return Title;
    }

    void setTitle ( String InputtedTitle)
    {
        Title = InputtedTitle;
    }

    int getID ()
    {
        return Id;
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
