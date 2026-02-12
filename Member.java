import java.util.List;
import java.util.ArrayList;
public class Member extends User
{
   private List<LibraryItem> borrowedItems; 

   public Member (String name , String UserID)
   {
        super( name , UserID ); 
        this.borrowedItems = new ArrayList<>();
   }

   public void borrowItem (LibraryItem Item)
   {
        borrowedItems.add(Item);
        System.out.print(" Borrowed: ");
        Item.getTitle();
   }

   public void returnItem (int id)
   {
        for (int i = 0 ; i < borrowedItems.size() ; i++ )
        {
            if ( borrowedItems.get(i).getID() == id )
            {
                borrowedItems.remove(i);
                System.out.println("Item with ID " + id + " has been removed.");
                return;
            }
        }
        System.out.println("Item with Entered ID was not found");
   }
}
