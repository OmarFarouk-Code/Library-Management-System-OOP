public class Librarian extends User
{
    private String employeeID;

    public Librarian ( String name , String UserID )
    {
        super( name , UserID);
    }

    void addItem(Library Library , LibraryItem Item)
    {
        Library.inventory.add(Item);
        System.out.println("New item added to inventory ");
        Item.getTitle();
    }

    void removeItem(Library Library , int ID)
    {
        boolean found = false;
        for (int i = 0 ; i < Library.inventory.size() ; i++)
        {
            if (Library.inventory.get(i).getID() ==  ID)
            {
                Library.inventory.remove(i);
                System.out.println("Item " + ID + " has been deleted from the system.");
                found = true;
            break;
            }
        }
        if (found == false)
        {
            System.out.println("Error: Item " + ID + " not found in inventory.");
        }
    }
}
