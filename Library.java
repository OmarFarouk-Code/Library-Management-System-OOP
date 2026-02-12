import java.util.List;

public class Library 
{
    static int totalItemsCount;
    List<LibraryItem> inventory;

    int findItem( String Title )
    {
        int itemIndex;
        for (int i = 0 ; i < totalItemsCount ; i++ )
        {
            if ( inventory.get(i).getTitle().toLowerCase() == Title.toLowerCase() )
            {
                itemIndex = i;
                return itemIndex;
            }
        }
    }

    int findItem( int ID )
    {
        int itemIndex;
        for (int i = 0 ; i < totalItemsCount ; i++ )
        {
            if ( inventory.get(i).getTitle().toLowerCase() == Title.toLowerCase() )
            {
                itemIndex = i;
                return itemIndex;
            }
        }
    }





}
