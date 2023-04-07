public class Book extends Resource{
    private String title;
    private String ISBN;
    private String searchID;
    private int numCopies;
    private String readerID;
    private int daysLeft;

    public Book(String title, String ISBN, String searchID, int numCopies, String readerID, int daysLeft) {
        this.title = title;
        this.ISBN = ISBN;
        this.searchID = searchID;
        this.numCopies = numCopies;
        this.readerID = readerID;
        this.daysLeft = daysLeft;

    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getSearchID() {
        return searchID;
    }

    public int getNumCopies() {
        return numCopies;
    }
    public String getReaderID() {
        return readerID;
    }

    public int getDaysLeft() {
        return daysLeft;
    }


}
