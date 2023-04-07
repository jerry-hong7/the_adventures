import java.util.*;
public class Library extends Readers {
    public Library () {}

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("Macbeth ");
        name.add("The Great Gatsby ");
        name.add("The Merriam-Webster Dictionary ");
        name.add("A Beautiful Mind ");
        name.add("Time ");
        name.add("National Geographic ");
        ArrayList<String> type = new ArrayList<>();
        type.add("Book ");
        type.add("Book ");
        type.add("Reference Source ");
        type.add("Reference Source ");
        type.add("Article ");
        type.add("Article ");
        ArrayList<String> ISBN = new ArrayList<>();
        ISBN.add("9780174434665");
        ISBN.add("9780460872706");
        ISBN.add("9780756957766");
        ISBN.add("9780684819068");
        ISBN.add("null");
        ISBN.add("null");
        ArrayList<String> SearchID = new ArrayList<>();
        SearchID.add("111222");
        SearchID.add("351769");
        SearchID.add("445566");
        SearchID.add("693369");
        SearchID.add("255050");
        SearchID.add("235821");
        ArrayList<Integer> numCopies = new ArrayList<>();
        numCopies.add(MacbethNum);
        numCopies.add(GatsbyNum);
        numCopies.add(DictNum);
        numCopies.add(MindNum);
        numCopies.add(TimeNum);
        numCopies.add(NatGeoNum);

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
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("" + input + " has " + getBook(input) + " copies in the library.");
    }




    //getBook

    //borrowBook

    //findResource which uses getBook
}

