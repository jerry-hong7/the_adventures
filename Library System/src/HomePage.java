import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends Library implements ActionListener{
    JFrame frame = new JFrame();
    JButton borrow = new JButton("BORROW BOOK");
    JButton find = new JButton("FIND RESOURCE");
    JButton readerInfo = new JButton("READERS INFO");
    JLabel welcome = new JLabel("Welcome to the OxLibrary System!");


    public HomePage() {
        frame.setBounds(10,10,550,550);
        frame.setTitle("Home: OxLibrary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(borrow);
        frame.add(find);
        frame.add(readerInfo);
        frame.add(welcome);

        borrow.addActionListener(this);
        find.addActionListener(this);
        readerInfo.addActionListener(this);

        welcome.setBounds(175,25,300,30);
        borrow.setBounds(175, 75, 175,30);
        find.setBounds(175, 225, 175, 30);
        readerInfo.setBounds(175, 375, 175, 30);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == borrow) {
            frame.dispose();
            BorrowBook borrow = new BorrowBook(getList());
        }

        if(e.getSource() == find) {
            frame.dispose();
            FindResource find = new FindResource(getList());
        }

        if(e.getSource() == readerInfo) {
            frame.dispose();
            ReaderInfo info = new ReaderInfo(getReaderList());
        }
    }
}
