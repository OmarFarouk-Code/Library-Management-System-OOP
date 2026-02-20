# 📚 Java Library Management System

A console-based Library Management System built with Java, demonstrating core Object-Oriented Programming principles including inheritance, polymorphism, and encapsulation.

---

## ✨ Features

- **Multi-type inventory** — Supports both Books and Magazines as distinct item types
- **Role-based access** — Separate `Librarian` and `Member` user roles with distinct permissions
- **Inventory management** — Add and remove items from the library catalog
- **Item search** — Find items by title (case-insensitive) or by ID
- **Borrowing system** — Members can borrow and return items
- **System report** — Print a full formatted report of all items currently in the library

---

## 🏗️ Project Structure

```
├── LibraryItem.java     # Abstract base class for all library items
├── Book.java            # Extends LibraryItem — adds author, pageCount, ISBN
├── Magazine.java        # Extends LibraryItem — adds issueNumber, publicationDate
├── User.java            # Base class for all users
├── Librarian.java       # Extends User — can add/remove items from inventory
├── Member.java          # Extends User — can borrow/return items
├── Library.java         # Core class holding inventory and search/report logic
└── Main.java            # Entry point — demonstrates full system workflow
```

---

## 🧠 OOP Concepts Demonstrated

| Concept | Where Applied |
|---|---|
| **Inheritance** | `Book` and `Magazine` extend `LibraryItem`; `Librarian` and `Member` extend `User` |
| **Polymorphism** | `DisplayDetails()` is overridden in `Book` and `Magazine` |
| **Encapsulation** | All fields are `private` with controlled getters/setters |
| **Method Overloading** | `findItem()` accepts either a `String` title or an `int` ID |

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Run

```bash
# Compile all files
javac *.java

# Run the program
java Main
```

---

## 📋 Sample Output

```
New item added: Java Programming
New item added: AI Today
======= LIBRARY SYSTEM REPORT =======
Total Items in Registry: 2
------------------------------------
ID : 101
Title : Java Programming
Author: Deitel
Pages: 500
ISBN: 123-ABC
------------------------------------
...
Item 101 has been deleted from the system.
```

---

## ⚠️ Known Limitations & Potential Improvements

- **No data persistence** — All data is lost when the program exits; a file or database layer could be added
- **`totalItemsCount` unused** — The static field in `Library.java` is declared but never updated
- **`employeeID` unused** — Declared in `Librarian.java` but never assigned or used
- **`Magazine` ignores `publicationDate`** — Stored in the constructor but not printed in `DisplayDetails()`
- **`borrowItem()` bug** — In `Member.java`, `Item.getTitle()` is called but the return value is never printed; should be `System.out.println(Item.getTitle())`

---

## 👤 Author

Developed by **Omar Farouk**
