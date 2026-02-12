
public class Main 
{
    public static void main(String[] args) 
    {
        // 1. Initialize the Library
        Library myLibrary = new Library();

        // 2. Create a Librarian
        Librarian headLibrarian = new Librarian("Omar Farouk", "L001"); //

        // 3. Create some Items 
        Book book1 = new Book(101, "Java Programming", "Deitel", 500, "123-ABC");
        Magazine mag1 = new Magazine(201, "AI Today", 45, "Feb 2026");

        // 4. Librarian adds items to the Library
        headLibrarian.addItem(myLibrary, book1); 
        headLibrarian.addItem(myLibrary, mag1);

        // 5. Print the Report to see it working
        myLibrary.printSystemReport();

        // 6. Test Removal
        headLibrarian.removeItem(myLibrary, 101);
        
        // 7. Print Report again to verify removal
        myLibrary.printSystemReport();
    }
}