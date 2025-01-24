import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class applet_calc extends JFrame implements ActionListener {
    // Components
    private JTextField input1, input2, result;
    private JButton add, subtract, multiply, divide, clear;

    public applet_calc() {
        // Set up the frame
        setTitle("Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with GridLayout
        JPanel panel = new JPanel();

        // Create components
        JLabel label1 = new JLabel("Number 1:");
        input1 = new JTextField(10);

        JLabel label2 = new JLabel("Number 2:");
        input2 = new JTextField(10);

        JLabel labelResult = new JLabel("Result:");
        result = new JTextField(10);
        result.setEditable(false);

        add = new JButton("Add");
        subtract = new JButton("Subtract");
        multiply = new JButton("Multiply");
        divide = new JButton("Divide");
        clear = new JButton("Clear");

        // Add components to the panel
        panel.add(label1);
        panel.add(input1);

        panel.add(label2);
        panel.add(input2);

        panel.add(labelResult);
        panel.add(result);

        panel.add(add);
        panel.add(subtract);
        panel.add(multiply);
        panel.add(divide);
        panel.add(clear);

        // Add panel to the frame
        add(panel);

        // Add action listeners
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        clear.addActionListener(this);

        // Set the frame to be visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse input numbers
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());

            // Perform the selected operation
            if (e.getSource() == add) {
                System.out.println(e.getActionCommand());
                result.setText(String.valueOf(num1 + num2));
            } else if (e.getSource() == subtract) {
                result.setText(String.valueOf(num1 - num2));
            } else if (e.getSource() == multiply) {
                result.setText(String.valueOf(num1 * num2));
            } else if (e.getSource() == divide) {
                if (num2 != 0) {
                    result.setText(String.valueOf(num1 / num2));
                } else {
                    result.setText("Error: Division by zero");
                }
            } else if (e.getSource() == clear) {
                input1.setText("");
                input2.setText("");
                result.setText("");
            }
        } catch (NumberFormatException ex) {
            result.setText("Error: Invalid input");
        }
    }

    public static void main(String[] args) {
        // Run the calculator
        new applet_calc();
    }
}
