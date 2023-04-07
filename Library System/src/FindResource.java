import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class FindResource extends Library implements ActionListener {
    JFrame frame = new JFrame();
    JLabel search = new JLabel("SEARCH");
    JLabel title = new JLabel("FIND RESOURCE");
    JLabel message = new JLabel();
    JButton searchButton = new JButton("SEARCH");
    JButton returnButton = new JButton("RETURN");
    JTextField searchField = new JTextField();
    ArrayList<Book> masterList;

   public FindResource(ArrayList<Book> masterList) {
        this.masterList = masterList;

        frame.setBounds(10,10,550,550);
        frame.setTitle("Find Resource: OxLibrary");
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

        searchButton.addActionListener(this);
        returnButton.addActionListener(this);

        title.setBounds(225,25,175,30);
        search.setBounds(100,125,100,30);
        searchField.setBounds(175,125,200,30);
        searchButton.setBounds(400,125,100,30);
        returnButton.setBounds(400,400,100,30);
        message.setBounds(25, 400, 550, 30);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == searchButton) {
            String input = searchField.getText();
            for(Book book: masterList) {
                if((book.getTitle().contains(input) && book.getNumCopies() > 0) || (book.getSearchID().contains(input) && book.getNumCopies() > 0)) {
                    message.setText(book.getTitle() + " has " + book.getNumCopies() + " available");
                    break;
                }
                else {
                    message.setText("Resource not found");
                }
            }
        }
        if(e.getSource() == returnButton) {
            frame.dispose();
            HomePage homePage = new HomePage();
        }
    }
}

