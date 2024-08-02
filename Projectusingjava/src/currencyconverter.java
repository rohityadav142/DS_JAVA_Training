import javax.swing.*;

public class currencyconverter {
    public static void main(String[] args) {
        currencyConverter();
    }

    }

    private static void currencyConverter() {
        JFrame frame=new JFrame("CurrencyConverter");
        JLabel rslable = new JLabel(" enter INR");
        JLabel usdlable = new JLabel(" enter USD");
        JTextField rupeefield = new JTextField();
        JTextField usdfield = new JTextField();
        JButton button=new JButton("convert");
        JLabel result= new JLabel();
        usdlable.setBounds(30, 30, 120, 40);
        usdfield.setBounds(150, 30, 50, 40);
        rslable.setBounds(30, 80, 120,40 );
        rupeefield.setBounds(150,80,50,40);
        button.setBounds();
        result.setBounds(140,130,150,40);
        frame.add(usdlable);
        frame.add(rslable);
        frame.add(usdfield);
        frame.add(rupeefield);

        frame.setLayout(null);
        // to set the size for frame
        frame.setSize(500, 750);
        // to visible the frame on  screen
        frame.setVisible(true);

    }
}
