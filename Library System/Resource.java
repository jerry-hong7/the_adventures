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

    public Resource() {}

    public Resource(int numBooks) {
        this.numBooks = numBooks;
    }

    public static int getBook(String bookName) {
        return numBooks;
    }

    public void borrowBook(String book, String reader, Date date) {}

}
