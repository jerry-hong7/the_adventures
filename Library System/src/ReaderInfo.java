import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ReaderInfo extends Library implements ActionListener{
    JFrame frame = new JFrame();
    DefaultTableModel tableModel;
    JTable table;
    ArrayList<Readers> userInfo;

    public ReaderInfo(ArrayList<Readers> userInfo) {
        this.userInfo = userInfo;
        tableModel = new DefaultTableModel();

        tableModel.addColumn("USERNAME");
        tableModel.addColumn("PASSWORD");
        tableModel.addColumn("ITEM(S) CHECKED OUT");
        tableModel.addColumn("DAYS REMAINING");

        addToJTable();

        table = new JTable(tableModel);
        Container container = frame.getContentPane();
        container.add(new JScrollPane(table), BorderLayout.CENTER);

        frame.setSize(550,550);
        frame.setTitle("Reader Info: OxLibrary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void addToJTable() {
        String username = userInfo.get(0).getUsername();
        String password = userInfo.get(0).getPassword();
        String title = userInfo.get(0).getTitle();
        int daysLeft = userInfo.get(0).getDaysLeft();

        Object[] data = {username, password, title, daysLeft};
        tableModel.addRow(data);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
