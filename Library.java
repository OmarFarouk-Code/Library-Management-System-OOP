import java.util.List;

public class Library 
{
    static int totalItemsCount;
    List<LibraryItem> inventory;

    public int findItem( String Title )
    {
        int itemIndex;
        for (int i = 0 ; i < inventory.size() ; i++ )
        {
            if ( inventory.get(i).getTitle().toLowerCase().equals(Title.toLowerCase() ) )
            {
                itemIndex = i;
                return itemIndex;
            }
        }
        return -1;
    }

    public int findItem( int ID )
    {
        int itemIndex;
        for (int i = 0 ; i < inventory.size() ; i++ )
        {
            if ( inventory.get(i).getID() == ID )
            {
                itemIndex = i;
                return itemIndex;
            }
        }
        return -1;
    }

    public void printSystemReport() 
    {
        System.out.println("======= LIBRARY SYSTEM REPORT =======");
        System.out.println("Total Items in Registry: " + inventory.size()); 
        System.out.println("------------------------------------");

        if (inventory.isEmpty()) 
        {
            System.out.println("The library is currently empty.");
        } 
        else 
        {
            for (LibraryItem item : inventory) 
            {
                item.DisplayDetails(); 
                System.out.println("------------------------------------");
            }
        }
        System.out.println("=========== END OF REPORT ===========");
    }
}
