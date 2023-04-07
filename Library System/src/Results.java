import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Results extends Library implements ActionListener{
    JFrame frame = new JFrame();
    DefaultTableModel tableModel;
    JTable table;
    ArrayList<Book> masterList;

    public Results(ArrayList<Book> masterList) {
        this.masterList = masterList;
        tableModel = new DefaultTableModel();

        tableModel.addColumn("Title");
        tableModel.addColumn("ISBN");
        tableModel.addColumn("SearchID");
        tableModel.addColumn("Copies");
        tableModel.addColumn("ReaderID");
        tableModel.addColumn("Days Left");

        addToJTable();

        table = new JTable(tableModel);
        Container container = frame.getContentPane();
        container.add(new JScrollPane(table), BorderLayout.CENTER);

        frame.setSize(550,550);
        frame.setTitle("Results: OxLibrary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void addToJTable() {
        for(int i = 0; i < masterList.size(); i++) {
            String title = masterList.get(i).getTitle();
            String ISBN = masterList.get(i).getISBN();
            String searchID = masterList.get(i).getSearchID();
            int numCopies = masterList.get(i).getNumCopies();
            String readerID = masterList.get(i).getReaderID();
            int daysLeft = masterList.get(i).getDaysLeft();

            Object[] data = {title, ISBN, searchID, numCopies, readerID, daysLeft};
            tableModel.addRow(data);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
