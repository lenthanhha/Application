package sprint1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TotalAmountCalculatorGUI {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Total Amount Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
 
        JLabel unitPriceLabel = new JLabel("Unit Price:");
        unitPriceLabel.setBounds(20, 20, 80, 25);
        frame.add(unitPriceLabel);

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setBounds(20, 60, 80, 25);
        frame.add(quantityLabel);

        JLabel resultLabel = new JLabel("Total Amount:");
        resultLabel.setBounds(20, 100, 100, 25);
        frame.add(resultLabel);

        JTextField unitPriceField = new JTextField();
        unitPriceField.setBounds(120, 20, 150, 25);
        frame.add(unitPriceField);

        JTextField quantityField = new JTextField();
        quantityField.setBounds(120, 60, 150, 25);
        frame.add(quantityField);

        JTextField resultField = new JTextField();
        resultField.setBounds(120, 100, 150, 25);
        resultField.setEditable(false); // Make result field read-only
        frame.add(resultField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(20, 130, 250, 25);
        frame.add(calculateButton);

        calculateButton.addActionListener((ActionEvent e) -> {
            try {
                
                double unitPrice = Double.parseDouble(unitPriceField.getText());
                int quantity = Integer.parseInt(quantityField.getText());
                
                double totalAmount = unitPrice * quantity;
                
                resultField.setText(String.format("%.2f", totalAmount));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}
