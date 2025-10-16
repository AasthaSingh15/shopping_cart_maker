import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShoppingCartSimulation extends JFrame implements ActionListener {
    JCheckBox laptop, phone, headphones;
    JButton generateBill;
    JLabel result;

    public ShoppingCartSimulation() {
        setTitle("Shopping Cart");
        setSize(300, 250);
        setLayout(new FlowLayout());

        laptop = new JCheckBox("Laptop - ₹60000");
        phone = new JCheckBox("Phone - ₹30000");
        headphones = new JCheckBox("Headphones - ₹2000");
        generateBill = new JButton("Generate Bill");
        result = new JLabel("");

        add(laptop);
        add(phone);
        add(headphones);
        add(generateBill);
        add(result);

        generateBill.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;
        String items = "Selected Items: ";

        if (laptop.isSelected()) {
            total += 60000;
            items += "Laptop ";
        }
        if (phone.isSelected()) {
            total += 30000;
            items += "Phone ";
        }
        if (headphones.isSelected()) {
            total += 2000;
            items += "Headphones ";
        }

        result.setText("<html>" + items + "<br>Total: ₹" + total + "</html>");
    }

    public static void main(String[] args) {
        new ShoppingCartSimulation();
    }
}