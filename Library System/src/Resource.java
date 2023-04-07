import java.util.*;
public abstract class Resource {
    public static List reader = new ArrayList();
    public String bookName;
    public static int numBooks;
    static Random ran = new Random();
    static int MacbethNum = ran.nextInt(6);
    static int GatsbyNum = ran.nextInt(6);
    static int DictNum = ran.nextInt(6);
    static int MindNum = ran.nextInt(6);
    static int TimeNum = ran.nextInt(6);
    static int NatGeoNum = ran.nextInt(6);
    static String Macbeth = "Macbeth";
    static String Gatsby = "The Great Gatsby";
    static String Dict = "The Merriam-Webster Dictionary";
    static String Mind = "A Beautiful Mind";
    static String Time = "Time";
    static String NatGeo = "National Geographic";
    static int daysLeft1 = ran.nextInt(31) + 1;
    static int daysLeft2 = ran.nextInt(31) + 1;
    static int daysLeft3 = ran.nextInt(31) + 1;
    static int daysLeft4 = ran.nextInt(31) + 1;
    static int daysLeft5 = ran.nextInt(31) + 1;
    static int daysLeft6 = ran.nextInt(31) + 1;


    public Resource() {}

    public Resource(int numBooks) {
        this.numBooks = numBooks;
    }

    public static int getBook(String bookName) {
        return numBooks;
    }

    public void borrowBook(String book, String reader, Date date) {}

}
