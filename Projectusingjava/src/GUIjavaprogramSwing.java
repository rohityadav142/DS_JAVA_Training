import javax.swing.*;
import java.awt.event.ActionEvent;

public class GUIjavaprogramSwing {
    public static void main(String[] args) {
        //to create  aframe  using swing in java
        JFrame frame = new JFrame("BMI calculator");
// create UI for BMI calculation
        JLabel heightlable = new JLabel(" enter your Height ");
        JLabel weightlable = new JLabel(" enter your Weight ");
        JLabel bmilable = new JLabel(" your BMI ");
        JTextField weighfield = new JTextField();
        JTextField heighfield = new JTextField();
        JButton bmibutton = new JButton("calculator BMI");
        //to set the size and position of UI components .
        heightlable.setBounds(30, 30, 120, 40);
        heighfield.setBounds(150, 30, 50, 40);
        weightlable.setBounds(30, 80, 120,40 );
        weighfield.setBounds(150,80,50,40);
        bmibutton.setBounds(30, 130, 120, 40);
        bmilable.setBounds(170,130,100,40);
        // to attached the label frame
        frame.add(heightlable);
        frame.add(heighfield);
        frame.add(weightlable);
        frame.add(weighfield);
        frame.add(bmibutton);
        frame.add(bmilable);

        //to build the default layout
        frame.setLayout(null);
        // to set the size for frame
        frame.setSize(300, 250);
        // to visible the frame on  screen
        frame.setVisible(true);
        bmibutton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // to apply the bmi formula
                float weight = Float.parseFloat(weighfield.getText().toString());
                float height = Float.parseFloat(heighfield.getText().toString());

                float output =weight/(height*height);
                // 18.5<under weight,18.5 to 24.9=normal,24.9 to 29.9 overweight
                if (output == 18.5) {
                    bmilable.setText("i am under weight");
                }else if(output>18.5&& output<24.9){
                    bmilable.setText("i am normal");
                } else if (output>24.9&& output<29.9) {
                    bmilable.setText("i am overweight");

                }else {
                    bmilable.setText("obesity");
                }
            }
        });
    }

}
