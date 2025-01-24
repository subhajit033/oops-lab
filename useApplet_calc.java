import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class useApplet_calc extends Applet implements ActionListener {
    // Components
    TextField input1, input2, result;
    Button add, subtract, multiply, divide, clear;

    @Override
    public void init() {
        // Set layout
        // setLayout(new GridLayout(5, 2, 5, 5));

        // Create components
        Label label1 = new Label("Number 1:");
        input1 = new TextField(10);

        Label label2 = new Label("Number 2:");
        input2 = new TextField(10);

        Label labelResult = new Label("Result:");
        result = new TextField(10);
        result.setEditable(false);

        add = new Button("Add");
        subtract = new Button("Subtract");
        multiply = new Button("Multiply");
        divide = new Button("Divide");
        clear = new Button("Clear");

        // Add components to the Applet
        add(label1);
        add(input1);

        add(label2);
        add(input2);

        add(labelResult);
        add(result);

        add(add);
        add(subtract);
        add(multiply);
        add(divide);
        add(clear);

        // Add action listeners
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        clear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse input numbers
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());

            // Perform the selected operation
            if (e.getActionCommand() == "Add") {
                result.setText(String.valueOf(num1 + num2));
            } else if (e.getActionCommand() == "Subtract") {
                result.setText(String.valueOf(num1 - num2));
            } else if (e.getActionCommand() == "Multiply") {
                result.setText(String.valueOf(num1 * num2));
            } else if (e.getActionCommand() == "Divide") {
                if (num2 != 0) {
                    result.setText(String.valueOf(num1 / num2));
                } else {
                    result.setText("Error: Division by zero");
                }
            } else if (e.getActionCommand() == "Clear") {
                input1.setText("");
                input2.setText("");
                result.setText("");
            }
        } catch (NumberFormatException ex) {
            result.setText("Error: Invalid input");
        }
    }
}
