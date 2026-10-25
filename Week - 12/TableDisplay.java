import javax.swing.*;
import java.io.*;
import java.util.*;

public class TableDisplay extends JFrame {

    TableDisplay() {

        setTitle("Table Display");
        setSize(600, 300);

        try {
            BufferedReader br = new BufferedReader(
                new FileReader("Table.txt")
            );

            // Read header
            String headerLine = br.readLine();
            String[] columns = headerLine.split(",");

            // Store rows
            ArrayList<String[]> rows = new ArrayList<>();

            String line;

            while ((line = br.readLine()) != null) {
                rows.add(line.split(","));
            }

            br.close();

            // Convert ArrayList to 2D array
            String[][] data = new String[rows.size()][columns.length];

            for (int i = 0; i < rows.size(); i++) {
                data[i] = rows.get(i);
            }

            JTable table = new JTable(data, columns);

            add(new JScrollPane(table));

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                this,
                "Error reading Table.txt"
            );
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TableDisplay();
    }
}