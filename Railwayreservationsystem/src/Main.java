import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/railwaysreservation";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("connected to data base");
            // design  JAVA UI frame for railway;
            JFrame frame = new JFrame("RAILWAYS RESERVATION SYSTEM");
            frame.getContentPane().setBackground(Color.lightGray);
            JLabel titlelable = new JLabel("Passenger Details");
            titlelable.setBounds(420, 10, 150, 180);
            titlelable.setForeground(Color.black);
            frame.add(titlelable);


            JLabel trainnamelable = new JLabel("ENTER THE TRAIN NAME/NUMBER");
            trainnamelable.setBounds(50, 50, 250, 180);
            trainnamelable.setForeground(Color.black);
            frame.add(trainnamelable);
            JTextField trainnamefield = new JFormattedTextField();
            trainnamefield.setBounds(350, 125, 200, 30);
            trainnamefield.setForeground(Color.black);
            frame.add(trainnamefield);
            JLabel passengernametable = new JLabel("ENTER THE PASSENGER NAME");
            passengernametable.setBounds(50, 100, 250, 180);
            passengernametable.setForeground(Color.black);
            frame.add(passengernametable);
            JTextField passengernamefield = new JFormattedTextField();
            passengernamefield.setBounds(350, 175, 200, 30);
            passengernamefield.setForeground(Color.black);
            frame.add(passengernamefield);
            JLabel gendertable = new JLabel("PASSENGER GENDER");
            gendertable.setBounds(50, 150, 250, 180);
            gendertable.setForeground(Color.black);
            frame.add(gendertable);
            JTextField genderfield = new JFormattedTextField();
            genderfield.setBounds(350, 225, 200, 30);
            genderfield.setForeground(Color.black);
            frame.add(genderfield);
            JLabel fromcitytable = new JLabel("FROM CITY");
            fromcitytable.setBounds(50, 200, 250, 180);
            fromcitytable.setForeground(Color.black);
            frame.add(fromcitytable);
            JTextField fromcityfield = new JFormattedTextField();
            fromcityfield.setBounds(350, 275, 200, 30);
            fromcityfield.setForeground(Color.black);
            frame.add(fromcityfield);
            JLabel tocitytable = new JLabel("TO CITY");
            tocitytable.setBounds(50, 250, 250, 180);
            tocitytable.setForeground(Color.black);
            frame.add(tocitytable);
            JTextField tocityfield = new JFormattedTextField();
            tocityfield.setBounds(350, 325, 200, 30);
            tocityfield.setForeground(Color.black);
            frame.add(tocityfield);
            JLabel seattypetable = new JLabel("SEAT TYPE");
            seattypetable.setBounds(50, 300, 250, 180);
            seattypetable.setForeground(Color.black);
            frame.add(seattypetable);
            JTextField seattypefield = new JFormattedTextField();
            seattypefield.setBounds(350, 375, 200, 30);
            seattypefield.setForeground(Color.black);
            frame.add(seattypefield);
            JButton button = new JButton("ADD PASSENGERS");
            button.setBounds(350, 600, 200, 30);
            button.setForeground(Color.black);
            frame.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String insert = "insert into railway(trainname,passengername,gender,fromcity,tocity,seattype) values(?,?,?,?,?,?)";
                    PreparedStatement sql = null;
                    try {
                        sql = conn.prepareStatement(insert);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        sql.setString(1,trainnamefield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        sql.setString(2, passengernamefield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        sql.setString(3, genderfield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        sql.setString(4, fromcityfield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        sql.setString(5, tocityfield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        sql.setString(6, seattypefield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        sql.executeUpdate();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });




            frame.setSize(1000, 800);
            frame.setLayout(null);
            frame.setVisible(true);



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}