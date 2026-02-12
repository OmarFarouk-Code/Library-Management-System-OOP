public class Librarian extends User
{
    private String employeeID;

    public Librarian ( String name , String UserID )
    {
        super( name , UserID);
    }

    void addItem(LibraryItem Item)
    {
        inventory.add(Item);
        System.out.print("New item added to inventory: ");
        Item.getTitle();
    }

    void removeItem(String ID)
    {
        boolean found = false;
        for (int i = 0 ; i < inventory.size() ; i++)
        {
            if (inventory.get(i).getID() ==  ID)
            {
                inventory.remove(i);
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
