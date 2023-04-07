import java.util.*;
public class Library extends Readers {
    static Scanner scan = new Scanner(System.in);
    ArrayList<Book> bookList;
    ArrayList<Readers> readerList;

    public Library() {
        Readers reader = new Readers("reader123", "Books234", "The Great Gatsby", 30);

        readerList = new ArrayList<>();
        readerList.add(reader);

        Book book1 = new Book("Macbeth", "9780174434665", "111222", MacbethNum, "ilovereading1", daysLeft1);
        Book book2 = new Book("The Great Gatsby", "9780460872706", "351769", GatsbyNum, "super123", daysLeft2);
        Book book3 = new Book("The Merriam-Webster Dictionary", "9780756957766", "445566", DictNum, "beastmode60", daysLeft3);
        Book book4 = new Book("A Beautiful Mind", "9780684819068", "693369", MindNum, "best789", daysLeft4);
        Book book5 = new Book("Time", "", "255050", TimeNum, "xtreme157", daysLeft5);
        Book book6 = new Book("National Geographic", "", "235821", NatGeoNum, "animals45", daysLeft6);

        bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);


    }
    public static void main(String[] args) {
        Register register = new Register();

    }

    protected ArrayList<Book> getList() {
        return bookList;
    }

    protected ArrayList<Readers> getReaderList() {
        return readerList;
    }

    public static int getBook(String bookName) {

        if (bookName.equalsIgnoreCase(Macbeth)) {
            if (MacbethNum == 0) {
                return -1;
            }
            else {
                return MacbethNum;
            }
        }
        if (bookName.equalsIgnoreCase(Gatsby)) {
            if (GatsbyNum == 0) {
                return -1;
            }
            else {
                return GatsbyNum;
            }
        }
        if (bookName.equalsIgnoreCase(Dict)) {
            if (DictNum == 0) {
                return -1;
            }
            else {
                return DictNum;
            }
        }
        if (bookName.equalsIgnoreCase(Mind)) {
            if (MindNum == 0) {
                return -1;
            }
            else {
                return MindNum;
            }
        }
        if (bookName.equalsIgnoreCase(Time)) {
            if (TimeNum == 0) {
                return -1;
            }
            else {
                return TimeNum;
            }
        }
        if (bookName.equalsIgnoreCase(NatGeo)) {
            if (NatGeoNum == 0) {
                return -1;
            }
            else {
                return NatGeoNum;
            }
        }
        else {
            return -2;
        }
    }

    public static void findResource() {
        System.out.println("Enter the name of the resource you are looking for.\n");
        String input = scan.nextLine();
        System.out.println("" + input + " has " + getBook(input) + " copies in the library.");
    }

}
