import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class BorrowBook extends Library implements ActionListener {
    JFrame frame = new JFrame();
    JLabel search = new JLabel("SEARCH");
    JLabel title = new JLabel("BORROW BOOK");
    JLabel message = new JLabel();
    JLabel bookReturn = new JLabel();
    JButton searchButton = new JButton("BORROW");
    JButton returnButton = new JButton("RETURN");
    JTextField searchField = new JTextField();
    ArrayList<Book> masterList;

    public BorrowBook(ArrayList<Book> masterList) {
        this.masterList = masterList;

        frame.setBounds(10, 10, 550, 550);
        frame.setTitle("Borrow: OxLibrary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.add(search);
        frame.add(title);
        frame.add(searchButton);
        frame.add(searchField);
        frame.add(returnButton);
        frame.add(message);
        frame.add(bookReturn);

        searchButton.addActionListener(this);
        returnButton.addActionListener(this);

        title.setBounds(225, 25, 175, 30);
        search.setBounds(100, 125, 100, 30);
        searchField.setBounds(175, 125, 200, 30);
        searchButton.setBounds(400, 125, 100, 30);
        returnButton.setBounds(400, 400, 100, 30);
        message.setBounds(50, 400, 400, 30);
        bookReturn.setBounds(50, 450, 400, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchButton) {
            String input = searchField.getText();
            for (Book book : masterList) {
                if ((book.getTitle().contains(input) && book.getNumCopies() > 0) || (book.getSearchID().contains(input) && book.getNumCopies() > 0)) {
                    Results result = new Results(getList());
                    message.setText("Book successfully checked out! Days to return: 30");
                    bookReturn.setText("");
                    break;
                }
                else if ((book.getTitle().contains(input) && book.getNumCopies() == 0) || (book.getSearchID().contains(input) && book.getNumCopies() == 0)){
                    message.setText("Resource currently unavailable!");
                    bookReturn.setText(book.getTitle() + " will be returned in " + book.getDaysLeft() + " days");
                    break;
                }
            }
        }
        if (e.getSource() == returnButton) {
            frame.dispose();
            HomePage homePage = new HomePage();
        }
    }
}
