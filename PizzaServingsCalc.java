/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzaservingscalc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ziyulin
 */

//PizzaServingCalculator

public class PizzaServingsCalc extends JFrame implements ActionListener {

    private JLabel titleLabel;
    private JLabel promptLabel;
    private JTextField sizeTextField;
    private JButton calculateButton;
    private JLabel servingsLabel;
    private JPanel line2;

    public PizzaServingsCalc() {
        // Frame configuration
        setTitle("Pizza Servings Calculator");
        setSize(350, 300);
        setLayout(new GridLayout(4, 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Title Label
        titleLabel = new JLabel("Pizza Servings Calculator");
        titleLabel.setForeground(Color.RED);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel);

        // Line 2 Panel
        line2 = new JPanel();
        promptLabel = new JLabel("Enter the size of the pizza in inches: ");
        sizeTextField = new JTextField(4);
        line2.add(promptLabel);
        line2.add(sizeTextField);
        add(line2);

        // Calculate Button
        calculateButton = new JButton("Calculate Servings");
        calculateButton.addActionListener(this);
        add(calculateButton);

        // Servings Label
        servingsLabel = new JLabel("");
        add(servingsLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Get the string value and parse to a double
            double size = Double.parseDouble(sizeTextField.getText()); 
            
            // Calculate the number of servings 
            double servings = Math.pow(size / 8, 2);
            
            servingsLabel.setText(String.format("A %.0f inch pizza will serve %.2f people", size, servings));
            servingsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        } catch (NumberFormatException ex) {
            // If the input is not a number
            JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() -> {
            new PizzaServingsCalc().setVisible(true);
        });
    }
    
}
