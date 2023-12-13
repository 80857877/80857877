// LibraryUser Interface
interface LibraryUser {
    void registerAccount(int age);

    void requestBook(String bookType);
}

// KidUser Class implementing LibraryUser interface
class KidUser implements LibraryUser {
    private int age;
    private String bookType;

    @Override
    public void registerAccount(int age) {
        this.age = age;
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook(String bookType) {
        this.bookType = bookType;
        if (bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are not allowed to take only kids books");
        }
    }
}

// AdultUser Class implementing LibraryUser interface
class AdultUser implements LibraryUser {
    private int age;
    private String bookType;

    @Override
    public void registerAccount(int age) {
        this.age = age;
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook(String bookType) {
        this.bookType = bookType;
        if (bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are not allowed to take only adult Fiction books");
        }
    }
}

// LibraryInterfaceDemo Class
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Test Case #1
        LibraryUser kidUser = new KidUser();
        kidUser.registerAccount(10);
        kidUser.requestBook("Kids");

        LibraryUser kidUser2 = new KidUser();
        kidUser2.registerAccount(18);
        kidUser2.requestBook("Fiction");

        // Test Case #2
        LibraryUser adultUser = new AdultUser();
        adultUser.registerAccount(5);
        adultUser.requestBook("Kids");

        LibraryUser adultUser2 = new AdultUser();
        adultUser2.registerAccount(23);
        adultUser2.requestBook("Fiction");
    }
}
