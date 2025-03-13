package sprint1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WaterMeterCalculatorGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Water Meter Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel firstDigitLabel = new JLabel("First Digit:");
        firstDigitLabel.setBounds(20, 20, 80, 25);
        frame.add(firstDigitLabel);

        JLabel lastDigitLabel = new JLabel("Last Digit:");
        lastDigitLabel.setBounds(20, 60, 80, 25);
        frame.add(lastDigitLabel);

        JLabel resultLabel = new JLabel("Total Amount:");
        resultLabel.setBounds(20, 100, 100, 25);
        frame.add(resultLabel);

        JTextField firstDigitField = new JTextField();
        firstDigitField.setBounds(120, 20, 150, 25);
        frame.add(firstDigitField);

        JTextField lastDigitField = new JTextField();
        lastDigitField.setBounds(120, 60, 150, 25);
        frame.add(lastDigitField);

        JTextField resultField = new JTextField();
        resultField.setBounds(120, 100, 150, 25);
        resultField.setEditable(false); // Make result field read-only
        frame.add(resultField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(20, 130, 250, 25);
        frame.add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int firstDigit = Integer.parseInt(firstDigitField.getText());
                    int lastDigit = Integer.parseInt(lastDigitField.getText());

                    int totalAmount = (firstDigit - lastDigit) * 10000;

                    resultField.setText(String.valueOf(totalAmount));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}